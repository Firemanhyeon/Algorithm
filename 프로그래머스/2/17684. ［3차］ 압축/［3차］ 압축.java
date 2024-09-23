import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            map.put(String.valueOf(ch), ch - 'A' + 1);
        }
        int mapSize=27;
        StringBuilder current = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<msg.length();i++){
            current.append(msg.charAt(i));
            // 현재까지 일치하는 가장 긴 문자열을 찾음
            while (i + 1 < msg.length() && map.containsKey(current.toString() + msg.charAt(i + 1))) {
                current.append(msg.charAt(++i));
            }
            //사전에 없을때 지금현재단어 사전번호 출력하고
            if(i+1<=msg.length() || !map.containsKey(current.toString())){
                result.add(map.get(current.toString()));
                //사전등록
                if(i+1<msg.length()){
                    map.put(current.toString()+ msg.charAt(i + 1) , mapSize++);
                }
                //현재단어 초기화
                current.setLength(0);
            }

        }
        answer=new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}