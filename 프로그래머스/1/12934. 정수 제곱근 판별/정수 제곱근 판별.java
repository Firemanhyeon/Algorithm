class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = (long)Math.sqrt(n);
        
        if(a*a==(long)n){//제곱근
            answer= (a+1)*(a+1);
        }else{//제곱근아님
            answer=-1;
        }
        
        return answer;
    }
}