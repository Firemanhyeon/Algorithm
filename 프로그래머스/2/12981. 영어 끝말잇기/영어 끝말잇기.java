import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
                //끝자리가 같지않은경우
                if(!list.get(i-1).endsWith(words[i].charAt(0)+"")){
                    answer[0]=list.size()%n+1;
                    answer[1]=list.size()/n+1;
                    break;
 
                //같은 단어 말했을때
                }if(list.contains(words[i])){
                   answer[0]=list.size()%n+1;
                    answer[1]=list.size()/n+1;
                    break;
                }
            
            list.add(words[i]);
        }
        return answer;
    }
}