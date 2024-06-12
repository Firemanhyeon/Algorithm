import java.util.*;

public class Solution {
    public int solution(int n) {
        int cnt =1;
        while(n/2>0){
            if(n%2==1){
                cnt++;
            }
            n=n/2;
        }
        
        
        return cnt;
    }
}