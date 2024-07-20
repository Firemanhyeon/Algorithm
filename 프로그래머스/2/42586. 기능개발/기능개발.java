import java.util.*;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progress = new LinkedList<>();
        Queue<Integer> speed = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        }
        int count =0;//걸린날짜 계산
        List<Integer> countList = new ArrayList<>();
        while(!progress.isEmpty()){
            //해당 큐 speed만큼 더해주기
            count++;
            int cnt =0; // 같은날에 같이배포되는 수
            if(progress.peek()+speed.peek()*count >= 100){
                progress.poll();
                speed.poll();
                cnt++;
                if(progress.isEmpty()){
                    countList.add(cnt);
                    break;
                }
                while(true){
                    if( progress.isEmpty()||progress.peek()+speed.peek()*count < 100 ){
                        countList.add(cnt);
                        break;
                    }else{
                        cnt++;
                        progress.poll();
                        speed.poll();
                    }
                }
            }
        }
        int[] answer = new int[countList.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=countList.get(i);
        }
        return answer;
    }
}