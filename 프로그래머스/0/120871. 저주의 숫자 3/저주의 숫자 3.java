class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n];
        int[] num1 = new int[n];
        int count=1;
        for(int i=0;i<num.length;i++){
            num[i] = i+1;
        }
        for(int i=0;i<num.length;i++){
            if(count%3==0 || String.valueOf(count).contains("3")){
                while(count%3==0 || String.valueOf(count).contains("3")){
                    count++;
                }
                num1[i]= count;
            }else{
                num1[i]=count;
            }
            count++;
        }
        answer=num1[n-1];
        return answer;
    }
}