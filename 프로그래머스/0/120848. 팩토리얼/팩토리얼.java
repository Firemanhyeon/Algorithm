class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt;
        for(int i=1;i<=10;i++){
            cnt=1;
            for(int j=1;j<=i;j++){
                cnt*=j;
            }
            if(cnt>n){
                answer=i-1;
                break;
            }else if( cnt==n){
                answer=i;
                break;
            }
        }
        return answer;
    }
}