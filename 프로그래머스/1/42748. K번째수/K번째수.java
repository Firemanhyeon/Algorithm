import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int[] list={};
        int count=0;
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0] ;//2
            int end = commands[i][1];//5
            int num = commands[i][2];//3
            list = new int[end-start+1];//4
            int cnt=0;
            for(int j=start-1;j<end;j++){//2345
                list[cnt]=array[j];
                cnt++;
            }
            Arrays.sort(list);
            answer[count]=list[num-1];
            count++;
        }
        return answer;
    }
}