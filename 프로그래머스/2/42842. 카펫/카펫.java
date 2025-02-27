class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        for(int i=1;i<sum;i++){
            if(sum % i == 0 ){
                answer[1] = i;//세로
                answer[0] = sum/i;//가로
                
                if( (answer[0] -2) * (answer[1]-2) == yellow ){
                    return answer;
                }
            }
        }
        return answer;
    }
}