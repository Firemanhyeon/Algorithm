import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        char[] words1 = str1.toCharArray();
        char[] words2 = str2.toCharArray();
        List<String> wList1 = getArr(words1);
        List<String> wList2 = getArr(words2);
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        int gyo = 0;
        int hap = 0;
        //각각의 집합에 겹치는 원소갯수 정리
        for(int i=0;i<wList1.size();i++){
            String wrd = wList1.get(i);
            map1.put(wrd,map1.getOrDefault(wrd,0)+1);
        }
        for(int j=0;j<wList2.size();j++){
            String wrd = wList2.get(j);
            map2.put(wrd,map2.getOrDefault(wrd,0)+1);
        }
        if(map1.size()==0 && map2.size()==0){
            return 65536;
        }
        
        //교집합구하기
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            String entryKey = entry.getKey();
            int entryValue = entry.getValue();
            //둘다 있을때
            if(map2.get(entryKey)!=null){
                //더 작은거 교집합에 넣기
                if(entryValue>=map2.get(entryKey)){
                    gyo+=map2.get(entryKey);
                }else{
                    gyo+=entryValue;
                }
            }
        }
        //합집합 구하기
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            hap += entry.getValue();
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            hap += entry.getValue();
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            if (map2.containsKey(key)) {
                hap -= Math.min(map1.get(key), map2.get(key));
            }
        }
        //계산
        if (hap == 0) {
            return 65536;
        }
        
        double jacard = (double) gyo / hap;
        answer = (int) (jacard * 65536);
        return answer;
    }
    
    //문자 2개로 나눠서 배열안에 넣기 
    public List<String> getArr(char[] words){
        List<String> wList = new ArrayList<>();
        for(int i=0;i<words.length-1;i++){
            char a = Character.toLowerCase(words[i]);
            char b = Character.toLowerCase(words[i+1]);
            if((a >= 'a' && a <= 'z')&& ((b >= 'a' && b <= 'z'))){
                String addword = String.valueOf(a)+String.valueOf(b);
                wList.add(addword);
            }
        }
        return wList;
    }
}