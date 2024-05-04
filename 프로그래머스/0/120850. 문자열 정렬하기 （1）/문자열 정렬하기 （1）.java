import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        char[]ch = my_string.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if((int)ch[i]<=57 && (int)ch[i]>=48){
                count++;
            }
        }
        answer = new int[count];
        
        int num=0;
        for(int i=0;i<ch.length;i++){
            if((int)ch[i]<=57 && (int)ch[i]>=48){
                answer[num]=(int)ch[i]-'0';
                num++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}