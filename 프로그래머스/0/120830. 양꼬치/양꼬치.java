class Solution {
    public int solution(int n, int k) {
        int service = (n/10);
        int answer = 0;
        answer = (n*12000)+((k-service)*2000);
        return answer;
    }
}