import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<numbers.length;i++){
            int idx=i-1;
            while(!stack.empty() && stack.peek()<numbers[i]){
                stack.pop();
                while(answer[idx]!=0){
                    idx--;
                }
                answer[idx--]=numbers[i];
            }
            
            stack.push(numbers[i]);
            
        }
        for(int i=0;i<answer.length;i++){
                if(answer[i]==0){
                    answer[i]=-1;
                }
            }
        return answer;
    }
}