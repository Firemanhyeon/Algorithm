class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n/2;i++){
            str.append("수박");
        }
        if(n%2==1){
            str.append("수");
        }
        answer = new String(str);
        return answer;
    }
}