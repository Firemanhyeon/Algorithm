import java.util.stream.*;
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        int cnt=control.chars().map(i->{
            if(i=='w'){
                 return 1;
            }else if(i=='s'){
                return -1;
            }else if(i=='d'){
                return 10;
            }else if(i=='a'){
                return -10;
            }else{
                return 0;
            }
        }).sum();
        return n+cnt;
    }
}