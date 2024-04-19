class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){//짝수
            int a = s.length()/2;
            answer+=s.charAt(a-1);
            answer+=s.charAt(a);
        }else{//홀수
            int a=s.length()/2;
            answer+=s.charAt(a);
        }
        return answer;
    }
}