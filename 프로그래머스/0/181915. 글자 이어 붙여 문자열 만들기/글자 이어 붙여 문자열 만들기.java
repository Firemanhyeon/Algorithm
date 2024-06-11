import java.util.stream.*;
import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        answer=Arrays.stream(index_list).mapToObj(a-> String.valueOf(my_string.charAt(a))).collect(Collectors.joining());
        return answer;
    }
}