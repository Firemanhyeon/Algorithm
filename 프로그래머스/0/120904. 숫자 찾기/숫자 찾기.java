class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        char[] arr = new char[str.length()] ;

        for(int i=0;i<str.length();i++){
           arr[i] = str.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            if((int)arr[i]-'0'==k){
                answer=i+1;
                break;
            }
        }

        return answer;
    }
}