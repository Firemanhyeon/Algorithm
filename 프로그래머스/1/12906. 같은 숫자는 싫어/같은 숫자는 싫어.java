import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int count=0;
        int num=10;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(num!=arr[i]){
                list.add(arr[i]);
            }
            num = arr[i];
        }
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}