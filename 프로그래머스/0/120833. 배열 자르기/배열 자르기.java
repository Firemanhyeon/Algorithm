class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[]answers=new int [num2-num1+1];
        int a =0;
        int cnt=0;
        while(true){
            if(a>=num1){
                answers[cnt]= numbers[a];
                if(a==num2){
                    answers[cnt]= numbers[a];
                    break;
                }
                cnt++;
            }
            a++;
        }
        return answers;
    }
}