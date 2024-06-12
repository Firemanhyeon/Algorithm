class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = brown+yellow;
        for(int i=1;i<=cnt;i++){
            if(cnt%i==0){
                if(yellow == (i-2)* ((cnt/i)-2)){
                    answer[0]=i;
                    answer[1]=cnt/i;
                }
            }
        }
        return answer;
    }
}