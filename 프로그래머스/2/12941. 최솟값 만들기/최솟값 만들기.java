import java.util.*;
import java.util.stream.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        // int idx=B.length-1;
        // for(int i=0;i<A.length;i++){
        //     answer+= A[i]*B[idx];
        //     idx--;
        // }
        
        answer = IntStream.range(0,A.length).map(i-> A[i]*B[B.length-1-i]).sum();
        return answer;
    }
}