class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int sum;
        for(int i=0;i<score.length;i++){
            sum=0;
            for(int j=0;j<score[i].length;j++){
                sum+=score[i][j];
            }
            answer[i]=sum/2.0;
        }
        int rank;
        int[] answer1 = new int[answer.length];
        for(int i=0;i<answer.length;i++){
            rank=1;
            for(int j=0;j<answer.length;j++){
                if(answer[j]>answer[i]){
                    rank++;
                }
            }
            answer1[i] = rank;
        }
        return answer1;
    }
}