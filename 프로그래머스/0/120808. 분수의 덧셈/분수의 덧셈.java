class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int answer1=0;
        int temp;

        int mom = denom1*denom2;
        int child ;
        int slice1 = mom/denom1;
        numer1 = numer1*slice1;
        slice1 = mom/denom2;
        numer2 = numer2*slice1;
        child = numer1+numer2;
        System.out.println(child +"   "+ mom);

        int a =child;
        int b = mom;
        //최대공약수 구하기
        if(a>b){
            answer1=b;
            while(a%b!=0){
                temp= a%b;
                a=b;
                b=temp;
                if (a % b == 0) {
                    answer1=b;
                }
            }
        }else if(a<b){
            answer1=a;
            while(b%a!=0){
                temp= b%a;
                b=a;
                a=temp;
                if (b % a == 0) {
                    answer1=a;
                }
            }
        }else if(a==b){
            answer1=b;
        }
        child = child/answer1;
        mom = mom/answer1;
        answer[0] = child;
        answer[1] = mom;



        return answer;
    }
}