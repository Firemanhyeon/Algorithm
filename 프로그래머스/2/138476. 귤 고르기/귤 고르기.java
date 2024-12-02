import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        int sum = 0;
        for(int i=list.size()-1;i>=0;i--){
            answer++;
            sum+=list.get(i);
            if(sum>=k){
                break;
            }
        }
        return answer;
    }
}