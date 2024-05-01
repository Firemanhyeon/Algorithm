import java.util.*;
class Solution {
    public StringBuilder solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char[] ch = my_string.toCharArray();
        char temp;
        temp = ch[num1];
        ch[num1]=ch[num2];
        ch[num2]=temp;
        for(int i=0;i<ch.length;i++){
            answer.append(ch[i]);
        }
        return answer;
    }
}