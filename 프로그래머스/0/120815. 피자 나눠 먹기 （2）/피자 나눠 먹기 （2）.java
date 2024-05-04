class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        for(int i=pizza;i<=300;i+=6){
            if(i%n==0){
                answer=i/6;
                break;
            }
        }
        return answer;
    }
}