import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0;i<s.length();i++){
            if(chk(s)){
                answer++;
            }
            s = next(s);
        }
        return answer;
    }


    //왼쪽으로 이동
    public static String next(String s){
        String str = s.substring(0,1);
        return s.substring(1)+str;
    }
    //조건에 부합하는지 체크
    public static boolean chk( String s ){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                stack.add(ch);
            }else if(!stack.isEmpty() && ch == ']' && stack.peek() == '['){
                stack.pop();
            }else if(!stack.isEmpty() && ch == '}'&& stack.peek() == '{'){
                stack.pop();
            }else if(!stack.isEmpty() && ch == ')'&& stack.peek() == '('){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;

    }
}