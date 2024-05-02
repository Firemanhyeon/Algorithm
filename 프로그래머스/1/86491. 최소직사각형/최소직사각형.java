import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0;i <sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        List<Integer> rowArr = new ArrayList<>();
        List<Integer> colArr = new ArrayList<>();
        for(int i=0;i<sizes.length;i++){
            rowArr.add(sizes[i][0]);
            colArr.add(sizes[i][1]);
        }
        Collections.sort(rowArr,Collections.reverseOrder());
        Collections.sort(colArr,Collections.reverseOrder());
        answer = rowArr.get(0) * colArr.get(0);
        return answer;
    }
}