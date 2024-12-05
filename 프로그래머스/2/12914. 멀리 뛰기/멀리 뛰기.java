class Solution {
    public long solution(int n) {
        long answer = 0;
        long a = 1;
        long b= 2;
        if(n==1) return a;
        if(n==2) return b;
        for(int i=3;i<=n;i++){
            long cnt = (a+b)%1234567;
            a=b;
            b=cnt;
            answer=cnt%1234567;
        }
        
        return answer;
    }
}