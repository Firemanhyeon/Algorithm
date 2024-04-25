class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
        while(n/a>0){
            int aa = (n/a)*b;
            int bb = n%a;
            n = aa+bb;
            answer+= aa;

        }
        return answer;
    }
}