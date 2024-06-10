class Solution {
    public int solution(int n) {
        int answer = 0;
        int one =0;
        int two =1;
        for(int i=2;i<=n;i++){
            answer = (one+two)%1234567;
            one=two%1234567;
            two=answer;
        }
        return answer;
    }
}