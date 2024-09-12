import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i=0;i<100000;i++){
            String num = Integer.toString(i,n).toUpperCase();
            str.append(num);
        }
        int turn =1;
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(turn == p){
                answer+=str.charAt(i);
                cnt++;
            }
            
            if(turn%m==0){
                turn=0;
            }
            turn++;
            if(cnt==t){
                break;
            }
            
        }
        return answer;
    }
}