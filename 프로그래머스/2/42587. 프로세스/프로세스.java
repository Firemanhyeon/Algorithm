import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer=0;
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : priorities){
            q.add(val);
            pq.add(val);
        }
        while(!q.isEmpty()){
            int num = q.peek();
            if(num == pq.peek()){
                q.poll();
                pq.poll();
                answer++;
                if(location==0){
                    return answer;
                }
            }else{
                q.poll();
                q.add(num);
            }
            location--;
            if (location < 0) {
                location = q.size() - 1; 
            }
        }
        return answer;
    }
}