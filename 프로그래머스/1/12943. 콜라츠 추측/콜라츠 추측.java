class Solution {
    public int solution(int num) {
        int answer = 0;
        Long num1 = (long)num;
        while(num1!=1){
            if(num1%2==0){
                num1=num1/2;
            }else{
                num1=num1*3+1;
            }
            if(answer>500){
                answer=-1;
                return answer;
            }
            answer++;
        }
        return answer;
    }
}