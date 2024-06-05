import java.util.stream.*;
import java.util.*;
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        
        answer = IntStream.rangeClosed(end_num , start).toArray();
        int[] answer1 = Arrays.stream(answer).boxed().sorted((a,b)-> b-a).mapToInt(i-> i).toArray();
        return answer1;
    }
}