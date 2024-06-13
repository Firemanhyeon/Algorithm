import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        double a = Arrays.stream(num_list).reduce(1,(c,d)-> c*d);
        double b = Arrays.stream(num_list).reduce(0,(c,d)-> c+d);
        b = Math.pow(b,2);
        
        System.out.println(a);
        System.out.println(b);
        return a<b ? 1 : 0;
    }
}