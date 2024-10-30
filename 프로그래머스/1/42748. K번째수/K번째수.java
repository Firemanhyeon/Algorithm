import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] newArr = {};
        int answerNum =0;
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0] -1;
            int end = commands[i][1] -1;
            int num = commands[i][2] -1;
            int idx=0;
            List<Integer> list = new ArrayList<>();
            for(int j=start ; j<=end;j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[answerNum++] = list.get(num);
        }
        return answer;
    }
}