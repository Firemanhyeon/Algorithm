class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(ch[i])){
               ch[i]= Character.toLowerCase(ch[i]);
            }else if(Character.isLowerCase(ch[i])){
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        for(int i=0;i<ch.length;i++){
            answer+=ch[i];
        }
        return answer;
    }
}