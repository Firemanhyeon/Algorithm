class Solution {
    int solution(int[][] land) {
        int[][] dp = new int[land.length][4];
        int answer=0;
        for(int i=0;i<4;i++){
            dp[0][i]= land[0][i];
        }
        for(int i=0;i<land.length-1;i++){
            for(int j=0;j<4;j++){
                int max=0;
                for(int k=0;k<4;k++){
                    if(j!=k){
                        max=Math.max(max,dp[i][k]);
                    }
                }
                dp[i+1][j] = land[i+1][j]+max;
            }
        }
        for(int i=0;i<dp[0].length;i++){
            answer = Math.max(answer,dp[dp.length-1][i]);
        }
        return answer;
    }
}