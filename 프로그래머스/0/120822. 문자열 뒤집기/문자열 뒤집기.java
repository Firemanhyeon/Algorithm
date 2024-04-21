
class Solution {
    public String solution(String my_string) {
        char[] chars = new char[my_string.length()];
        for(int i=0; i<my_string.length();i++){
            chars[i] = my_string.charAt(i);
        }
        for(int j=0;j<chars.length-1;j++){
                for(int i=0; i<chars.length-1-j;i++){
                    char temp = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1]= temp;
                }
            }
        
         return new String(chars);
    }
}