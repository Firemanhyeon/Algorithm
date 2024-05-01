class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        char ch1 = letter.charAt(0);
        for(int i=0; i<ch.length;i++){
            if(ch[i]!=ch1){
                answer+=ch[i];
            }
        }
        return answer;
    }
}