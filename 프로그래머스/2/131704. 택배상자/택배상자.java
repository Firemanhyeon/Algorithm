import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> secBelt = new Stack<>(); 
        int idx = 0; 
        
        for (int i = 1; i <= order.length; i++) {
            if (i == order[idx]) {
                answer++;
                idx++;
            } else {
                secBelt.push(i);
            }
            
            while (!secBelt.isEmpty() && secBelt.peek() == order[idx]) {
                secBelt.pop();
                answer++;
                idx++;
            }
        }
        
        return answer;
    }
}