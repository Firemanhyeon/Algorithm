import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            answer+=a;
        }
        return answer;
    }
}