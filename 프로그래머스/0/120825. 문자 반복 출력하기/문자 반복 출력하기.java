class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int cnt=0;
        char[] ch = new char[my_string.length()*n];
        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<n;j++){
                ch[cnt]= my_string.charAt(i);
                cnt++;
            }
        }



        for(int i=0;i<ch.length;i++){
            answer+=ch[i];
        }
        return answer;
    }
}