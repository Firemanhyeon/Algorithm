import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count=0;
        for(int i=0;i<quiz.length;i++){
            String[] split = quiz[i].split(" ");
            int first = Integer.parseInt(split[0]);
            int second = Integer.parseInt(split[2]);
            int ox = Integer.parseInt(split[4]);
            String math = split[1];
            if(math.equals("-")){
                if(ox == (first-second)){
                    answer[count++] = "O";
                }else{
                    answer[count++] = "X";
                }
            }else{
                if(ox == (first+second)){
                    answer[count++] = "O";
                }else{
                    answer[count++] = "X";
                }
            }

        }
        return answer;
    }
}