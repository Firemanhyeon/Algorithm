import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            str.append(ch[i]);
        }
        
        answer = str.reverse().toString();
        return answer;
    }
}