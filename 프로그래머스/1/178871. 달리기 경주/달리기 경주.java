import java.util.*;
class Solution {
    static Map<String , Integer> map = new HashMap<>();
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        List<String> list = new ArrayList<>(Arrays.asList(players));
        
        //맵에서 현재 등수를 넣어줘요
        for(int i=0;i<players.length;i++){
            map.put(players[i] , i);
        }
        //해설진이 부른 횟수만큼 반복
        for(int i=0;i<callings.length;i++){
            //부른사람의 인덱스 찾기
            int nowRank = map.get(callings[i]);
            //그 인덱스와 앞사람의 인덱스
            swap(list  ,nowRank-1 , nowRank );
            
        }
        
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    
    public static void swap(List<String>list , int i , int j){
        String temp = list.get(i); // b 2
        list.set(i,list.get(j));// a 1
        list.set(j,temp); //
        
        // b 1 a 2
        //i가 앞사람 인덱스
        //j가 불려진이름 인덱스
        
        map.put(list.get(i) , i);
        map.put(list.get(j) , j);
    }
    
}