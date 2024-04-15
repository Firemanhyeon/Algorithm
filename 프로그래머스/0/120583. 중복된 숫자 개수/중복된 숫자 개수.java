class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int cnt : array){
            if(cnt == n){
                answer++;
            }
        }
        return answer;
    }
}