import java.util.stream.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder str = new StringBuilder(my_string);
        str.reverse();
        String str1 = str.toString();
        answer=IntStream.range(0,n).mapToObj(a-> String.valueOf(str1.charAt(a))).collect(Collectors.joining());
        str = new StringBuilder(answer);
        str.reverse();
        answer=str.toString();
        return answer;
    }
}