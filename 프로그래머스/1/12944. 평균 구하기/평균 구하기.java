class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double a = 0;
        for(double cnt : arr){
            a+=cnt;
        }
        answer = (double)(a/arr.length);
        return answer;
    }
}