class Solution {
    public int solution(int n) {
        int piz = 7;
        int answer;
        answer = n/piz;
        if(n%piz>0){
            answer++;
        }
        return answer;
    }
}