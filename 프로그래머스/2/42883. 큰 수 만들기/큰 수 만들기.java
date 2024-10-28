import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<number.length();i++){
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            while(!stack.isEmpty() && stack.peek()<num && k>0){
                stack.pop();
                k--;
            }
            stack.push(num);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        for(int current : stack){
            answer.append(String.valueOf(current));
        }
        return answer.toString();
    }
}