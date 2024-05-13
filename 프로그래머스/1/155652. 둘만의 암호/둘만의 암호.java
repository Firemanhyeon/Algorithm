import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=0;j<index;j++){
                ch+=1;
                if(ch>'z'){
                    ch = 'a';
                }
                if(skip.contains(String.valueOf(ch))){
                    j--;
                }
            }
            answer+= String.valueOf(ch);
        }
        return answer;
    }
}
//97~122소문자
//65~90 대문자
