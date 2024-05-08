import java.util.*;
class Solution {
    //현재 명예의전당중에서 젤 작은수
    public static int updown(int[]score ){
        int max = score[0];
        for(int i=0;i<score.length;i++){
            if(max>score[i]){
                max = score[i];
            }
        }
        return max;
    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        //현재 명예의전당 숫자
        //
        int max = score[0];
        //k만큼 명예의전당에 넣기
        if(k<score.length){
            for(int i=0;i<k;i++){
                if(score[i]<max){
                    max=score[i];
                }
                answer[i]=score[i];
                list.add(max);
            }    
        }else{
            for(int i=0;i<score.length;i++){
                if(score[i]<max){
                    max=score[i];
                }
                answer[i]=score[i];
                list.add(max);
            }   
        }
        
        for(int i=k;i<score.length;i++){
            if(max<score[i]){
                for(int j=0;j<answer.length;j++){

                    if(max==answer[j]){
                        answer[j] = score[i];
                        max=updown(answer);
                        list.add(max);
                        break;
                    }
                }

            }else{
                list.add(max);
            }
        }
        int[]answer1 = new int[list.size()];
        for(int i=0;i<answer1.length;i++){
            answer1[i]=list.get(i);
        }
        return answer1;
    }
}