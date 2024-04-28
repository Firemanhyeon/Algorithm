class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] ch = cipher.toCharArray();
        for(int i=1;i<=ch.length;i++){
            if(i%code==0){
                answer+=ch[i-1];
            }
        }
        return answer;
    }
}