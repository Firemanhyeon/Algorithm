import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map< String , List<String>> map = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],new ArrayList<>());
            }
            map.get(clothes[i][1]).add(clothes[i][0]);
        }
        Set<String> keys = map.keySet();
        
        for(String key : keys){
            List<String> list = map.get(key);
            System.out.println(list.size());
            answer*= list.size()+1;
        }
        answer= answer-1;
        
        return answer;
    }
}