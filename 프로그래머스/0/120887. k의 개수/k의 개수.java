class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int cnt;
        for(int m=i;m<=j;m++){
            cnt=m;
            while(cnt>0){
                if((cnt%10)==k){
                    answer++;
                }
                cnt=cnt/10;
            }
        }
        return answer;
    }
}