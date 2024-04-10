class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX=dots[0][0];
        int minX=dots[0][0];
        int maxY=dots[0][1];
        int minY=dots[0][1];
        int Xcount =0;
        int Ycount=0;
        for(int i=0; i<dots.length; i++){
            if(maxX<dots[i][0]){
                maxX=dots[i][0];
            }
            if(minX>dots[i][0]){
                minX=dots[i][0];
            }
            if(maxY<dots[i][1]){
                maxY=dots[i][1];
            }
            if(minY>dots[i][1]){
                minY=dots[i][1];
            }
        }
        for(int i=minX;i<maxX;i++){
            Xcount++;
        }
        for(int i=minY;i<maxY;i++){
            Ycount++;
        }
        answer=Xcount*Ycount;
        return answer;
    }
}