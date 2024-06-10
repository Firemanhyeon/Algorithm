import java.util.stream.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = IntStream.range(0,n).mapToObj(i->String.valueOf(my_string.charAt(i))).collect(Collectors.joining());
        return answer;
    }
}