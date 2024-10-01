import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            pq.add(scoville[i]);
        }
        while(!pq.isEmpty()){
            int first = pq.poll();
            if(first>=K){
                break;
            }
            if(!pq.isEmpty()){
                int second = pq.poll();
                int result = first+(second*2);
                pq.add(result);
                answer++;
            }else{
                return -1;
            }
            
        }
        return answer;
    }
}