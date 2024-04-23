class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cnt=price;//한번타는데 금액
        long num=0;//총금액
        for(int i=0;i<count;i++){
            num += cnt;
            cnt+=price;
        }
        answer = money<num ?Math.abs(money-num) : 0 ;
        // if(money>num){
        //     answer = money-num;
        // }else{
        //     answer =0;
        // }
        return answer;
    }
}