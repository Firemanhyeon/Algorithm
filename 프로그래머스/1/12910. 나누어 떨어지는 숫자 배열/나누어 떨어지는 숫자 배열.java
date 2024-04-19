import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        if(count>0){
            answer = new int[count];
        }else{
            answer= new int[1];
            answer[0] = -1;
            return answer;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[cnt]= arr[i];
                cnt++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
