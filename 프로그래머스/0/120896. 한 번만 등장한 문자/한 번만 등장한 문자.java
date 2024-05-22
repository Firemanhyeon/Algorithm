import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int cnt;
        for(int i=0;i<ch.length;i++){
            String con = String.valueOf(ch[i]);
            cnt=1;
            for(int j=0;j<ch.length;j++){
                if(con.equals(String.valueOf(ch[j]))&& j!=i){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=con;
            }
        }
        return answer;
    }
}