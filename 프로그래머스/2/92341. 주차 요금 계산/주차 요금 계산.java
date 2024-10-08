import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String,String> inout = new HashMap<>();
        Map<String,Integer> pay = new TreeMap<>();
        for(int i=0;i<records.length;i++){
            String[] info = records[i].split(" ");
            //입차일때
            if(info[2].equals("IN")){
                inout.put(info[1],info[0]);
            //출차일때
            }else{
                String inTime = inout.get(info[1]);//입차시간
                String outTime = info[0];//출차시간
                int result = calc(inTime , outTime , fees);
                pay.put(info[1],pay.getOrDefault(info[1],0)+result);
                inout.remove(info[1]);
            }
        }
        for(String carnumber : inout.keySet()){
            String inTime = inout.get(carnumber);
            int result = calc(inTime , "23:59" , fees);
            pay.put(carnumber,pay.getOrDefault(carnumber,0)+result);
        }
        answer = new int[pay.size()];
        int idx=0;
        for(String key : pay.keySet()){
            int min = pay.get(key);
            if(min<=fees[0]){
                answer[idx]=fees[1];
                idx++;
                continue;
            }else{
                answer[idx]= (min-fees[0])%fees[2] == 0 ? fees[1] + (min-fees[0])/fees[2]*fees[3] : fees[1]+ ((min-fees[0])/fees[2]+1)*fees[3];
                idx++;
            }   
            
        }
        return answer;
    }
    public static int calc(String inTime , String outTime , int[] fees){
        // 시간 차이를 분 단위로 계산
        String[] inArr = inTime.split(":");
        String[] outArr = outTime.split(":");

        int inHour = Integer.parseInt(inArr[0]);
        int inMin = Integer.parseInt(inArr[1]);
        int outHour = Integer.parseInt(outArr[0]);
        int outMin = Integer.parseInt(outArr[1]);

        int totalInMinutes = inHour * 60 + inMin;
        int totalOutMinutes = outHour * 60 + outMin;

        // 주차 시간 (분 단위)
        return totalOutMinutes - totalInMinutes;
    }
}