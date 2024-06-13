import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = Arrays.stream(num_list).filter(i-> i%2==1).mapToObj(str-> String.valueOf(str)).collect(Collectors.joining());
        String b = Arrays.stream(num_list).filter(i-> i%2==0).mapToObj(str-> String.valueOf(str)).collect(Collectors.joining());
        answer = Integer.parseInt(a)+ Integer.parseInt(b);
        return answer;
    }
}