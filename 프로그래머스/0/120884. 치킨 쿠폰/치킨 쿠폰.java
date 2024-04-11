class Solution {
    public int solution(int chicken) {
        int answer = 0;
        // i 쿠폰 
        //answer = 서비스로받은치킨
        int coupon = 0;
        for(int i=0;i<chicken;i++){
            coupon++;
            if(coupon%10==0){
                coupon++;
            }
            
        }
        return coupon/10;
    }
}