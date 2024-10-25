import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        Long result1=0L;
        Long result2=0L;
        for(int i=0;i<queue1.length;i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            result1+=queue1[i];
            result2+=queue2[i];
        }
        while(result1!=result2){
            if(result1>result2){
                int num = q1.poll();
                q2.add(num);
                result1-=num;
                result2+=num;
                answer++;
            }else if(result1<result2){
                int num = q2.poll();
                q1.add(num);
                result1+=num;
                result2-=num;
                answer++;
            }else{
                return answer;
            }
            
            if(answer>3000000){
                return -1;
            }
        }
        return answer;
    }
}