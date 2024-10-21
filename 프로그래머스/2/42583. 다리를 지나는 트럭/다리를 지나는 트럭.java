import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> wait = new LinkedList<>();//대기
        Queue<Integer> go = new LinkedList<>();//다리위
        for(int i=0;i<truck_weights.length;i++){
            wait.add(truck_weights[i]);//대기채우기
        }
        for(int i=0;i<bridge_length;i++){
            go.add(0);
        }
        
        int now =0;
        while(!go.isEmpty()){
            answer++;
            int finish = go.poll();
            now-=finish;
            
            if(!wait.isEmpty() && wait.peek() + now <= weight){
                int plus = wait.poll();
                go.add(plus);
                now+=plus;
            }else if(wait.isEmpty()){
                continue;
            }else{
                go.add(0);
            }
        }
        return answer;
    }
}