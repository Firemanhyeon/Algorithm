import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int cnt = (int)(right - left + 1);
        int[] answer = new int[cnt];

        for (long idx = left; idx <= right; idx++) {
            int row = (int)(idx / n); // 행 번호
            int col = (int)(idx % n); // 열 번호
            answer[(int)(idx - left)] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}