class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aa=a;
        int bb=b;
        int temp;
        int answer1=1;//최대공약수
        while(aa%bb!=0){
            temp= aa%bb;
            aa=bb;
            bb=temp;
            if (aa % bb == 0) {
                answer1=bb;
            }
        }
        a = a/answer1;
        b= b/answer1;
        if(a==b){
            answer=1;
            return answer;
        }
        boolean chk=true;
        while(b%2==0){
            b/=2;
        }
        while(b%5==0){
            b/=5;
        }
        if(b==1){
            answer=1;
        }else{
            answer=2;
        }

        return answer;
    }
}