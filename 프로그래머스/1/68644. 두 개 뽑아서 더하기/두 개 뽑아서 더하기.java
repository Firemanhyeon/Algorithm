import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                int num = numbers[i]+numbers[j];
                if(!list.contains(num)){
                    list.add(num);
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}