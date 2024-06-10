import java.util.stream.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.length() < is_suffix.length()){
            return 0;
        }
        long cnt = IntStream.range(my_string.length() - is_suffix.length() , my_string.length())
                                                                    .filter(a-> my_string.charAt(a)==is_suffix.charAt(a-my_string.length() +is_suffix.length())).count();
        
        if(cnt==is_suffix.length()){
            answer=1;
        }
        return answer;
    }
}