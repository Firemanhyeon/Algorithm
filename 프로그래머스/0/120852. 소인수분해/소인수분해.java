import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        //소수들의 곱
        //12를 2로 나눈다 나누고 배열안에 넣기 나눠지면 다시 2로
        //안나눠지면 인수++해서 다시나눔
        int cnt=n;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                answer.add(i);
            }
            while(n%i==0){
                n/=i;
            }
        }
        return answer;
    }
}