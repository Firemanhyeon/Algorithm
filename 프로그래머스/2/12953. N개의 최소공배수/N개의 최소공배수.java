import java.util.*;

class Solution {
    public int solution(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int num = gcd(arr[i],arr[i+1]);//n과 n+1의 최대공약수
            int num2 = lcm(num , arr[i],arr[i+1]);
            arr[i+1]= num2;
        }
        
        return arr[arr.length-1];
    }
    
    //최대공약수 함수
    public int gcd(int a , int b){
        int c=1;
        while(a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        
        return b;
    }
    //최소공배수
    public int lcm(int gcd , int a , int b){
        return a*b/gcd;
    }
}