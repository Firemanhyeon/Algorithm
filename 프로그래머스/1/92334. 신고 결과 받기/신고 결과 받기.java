import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,Set<String>> reporter = new HashMap<>();
        Map<String,Integer> reportedUser = new HashMap<>();
        
        
        
        for(String str : report){
            String[] strArr = str.split(" ");
            Set<String> set = reporter.getOrDefault(strArr[0], new HashSet<>());
            // 사용자가 신고한 유저에 포함 안될 경우 +1
            if(!set.contains(strArr[1])){
                set.add(strArr[1]);
                reportedUser.put(strArr[1], reportedUser.getOrDefault(strArr[1], 0) + 1);
                reporter.put(strArr[0], set);
            }
        }

        
        Map<String,Integer> map3 = new HashMap<>();
        for(int i=0;i<id_list.length;i++){
            int cnt = reportedUser.getOrDefault(id_list[i],0);
            if(cnt>=k){
                //신고를 당해서 정지당한 사람에게 메일발송
                // map3.put(id_list[i], map3.getOrDefault(id_list[i] , -1) +1);
                //신고를 한 사람에게 메일발송
                for(String key : reporter.keySet()){
                    if(reporter.get(key).contains(id_list[i])){
                        map3.put(key , map3.getOrDefault(key,0) +1);
                    }
                }

            }
        }
        for(int i=0;i<id_list.length;i++){
            answer[i] = map3.getOrDefault(id_list[i] , 0 );
        }
        return answer;
    }
}