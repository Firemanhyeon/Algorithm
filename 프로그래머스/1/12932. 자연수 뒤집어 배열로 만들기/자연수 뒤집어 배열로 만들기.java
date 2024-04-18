class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int count=0;
        long n1 = n;
        while(n1>0){
            count++;
            n1=n1/10;
        }
        answer = new int[count];
        for(int i=0;i<count;i++){
            answer[i]=(int)(n%10);
            n=n/10;
        }
        
        return answer;
    }
}