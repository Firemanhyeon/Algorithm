import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i=1;i<=n;i++){
            map.put(i,0);
        }

        char end = words[0].charAt(words[0].length()-1);

        for(int i=0;i<words.length;i++){
            char start = words[i].charAt(0);
            //겹치는 단어를 말했을때
            if(set.contains(words[i])){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;

            //끝자리 단어와 일치하지 않을때
            }else if(start != end && i!=0){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            //정상패스
            }else{
                set.add(words[i]);
                map.put(i%n+1,map.getOrDefault(i%n+1,0)+1);
                end = words[i].charAt(words[i].length()-1);
            }
        }
        return answer;
    }
}