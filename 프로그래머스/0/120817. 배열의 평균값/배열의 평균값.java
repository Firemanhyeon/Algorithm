class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int sum : numbers){
            answer+=sum;
        }
        answer= answer/numbers.length;
        return answer;
    }
}