class Solution {
     // 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    public int solution(int[] arr) {
        int answer = 0;
        int a = arr[0];
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt = lcm(a,arr[i]);
            a=cnt;
            System.out.println(cnt);
        }
        answer=cnt;
        return answer;
    }
}