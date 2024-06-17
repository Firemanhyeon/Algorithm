class Solution {
    public long solution(int n) {
        long answer = 0;
        long a =0;
        long b=1;
        long result=0;
        for(int i=1;i<=n;i++){
            answer = (a+b)%1234567;
            a=b;
            b=answer;// 1
        }
        return answer%1234567;
    }
}