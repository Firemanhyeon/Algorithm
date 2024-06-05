import java.util.stream.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int length = is_prefix.length();
        if(my_string.length() < is_prefix.length()){
            return 0;
        }
        return IntStream.range(0,length).mapToObj(i-> String.valueOf(my_string.charAt(i))).collect(Collectors.joining()).equals(is_prefix) ? 1 : 0; 
    }
}