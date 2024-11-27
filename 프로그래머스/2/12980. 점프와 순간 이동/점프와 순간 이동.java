import java.util.*;

public class Solution {
    public int solution(int n) {

        int count=0;
        while(n>0){
            if(n%2!=0){
                n--;
                count++;
            }
            n=n/2;
        }
        
        return count;
    }
}