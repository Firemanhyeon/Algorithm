import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num , (a,b)-> (b+a).compareTo(a+b));
        
        StringBuilder result = new StringBuilder();
        for(String a : num){
            result.append(a);
        }
        answer = result.toString();
        if(answer.charAt(0)=='0'){
            return "0";
        }
        return answer;
    }
}