import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<record.length;i++){
            String[] msg = record[i].split(" ");
            if(msg[0].equals("Enter")){
                
                map.put(msg[1],msg[2]);
                
            }else if(msg[0].equals("Change")){
                map.put(msg[1],msg[2]);
            }
        }
        for(int i=0;i<record.length;i++){
            String[] msg = record[i].split(" ");
            if(msg[0].equals("Enter")){
                
                list.add(map.get(msg[1])+"님이 들어왔습니다.");
                
            }else if(msg[0].equals("Leave")){
                list.add(map.get(msg[1])+"님이 나갔습니다.");
                
            }
        }
        answer = new String[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}