import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        for(int i=0;i<=discount.length-10;i++){
            Map<String,Integer> map1 = new HashMap<>();

            for(int j=i;j<i+10;j++){
                map1.put(discount[j],map1.getOrDefault(discount[j] , 0) +1);
            }

            boolean chk= true;
            for(String key : map.keySet()){

                int cnt = map.get(key);
                int cnt1 = map1.getOrDefault(key,0);
                if(cnt != cnt1){

                    chk=false;
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