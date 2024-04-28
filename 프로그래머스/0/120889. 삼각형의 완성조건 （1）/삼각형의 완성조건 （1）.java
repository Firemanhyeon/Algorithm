class Solution {
    public int solution(int[] sides) {
        int max=sides[0];
        int sum=0;
        for(int num : sides){
            if(num>max){
                max=num;
            }
            sum+=num;
        }
        if(sum-max<=max){
            return 2;
        }else{
            return 1;
        }
        

    }
}