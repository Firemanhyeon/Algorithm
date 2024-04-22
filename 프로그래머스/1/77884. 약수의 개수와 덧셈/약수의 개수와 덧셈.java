class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count=0;
        for(int i= left;i<=right;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            System.out.println(count);
            if(count%2==1){
                answer-=i;
            }else{
                answer+=i;
            }
        }
        return answer;
    }
}