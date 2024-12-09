import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> map1 = new HashMap<>();//정현이가 원하는 물품을 정리해놓은 map
        Map<String,Integer> map2 = new HashMap<>();//슈퍼마켓에서 제공하는 품목 정리 map

        //정현이가 원하는물품 map에 담기
        for(int i=0;i<want.length;i++){
            map1.put(want[i],number[i]);
        }
        //슈퍼마켓에서 제공하는 물품 map에담기
        for(int j=0;j<=discount.length-10;j++){
            //정리map 초기화
            map2 = new HashMap<>();
            //n일차에 해당하는 10일동안의 물품개수정리
            for(int i=j;i<j+10;i++){
                map2.put(discount[i], map2.getOrDefault(discount[i],0)+1);
            }
            //n일차에 해당하는 10일동안의 물품이 맞는지 확인
            boolean chk = true;
            for(Map.Entry<String,Integer> entry : map1.entrySet() ){
                String str = entry.getKey();
                int val1 = entry.getValue();
                if(map2.get(str) ==null){
                    chk=false;
                    break;
                }
                int val2 = map2.get(str);

                //종현이가 원하는 물품만큼 살수 없을때
                if(val1 > val2){
                    chk= false;
                    break;
                }
            }
            if(chk){
                answer++;
            }
        }
        return answer;
    }
    
}