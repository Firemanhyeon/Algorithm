class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = {'a','e','i','o','u'};
        boolean check=false;
        for(int i=0; i<my_string.length();i++){
            check=false;
            for(int j=0;j<ch.length;j++){
                if(my_string.charAt(i)==ch[j]){
                    check=false;
                    break;
                }else{
                    check=true;
                }
            }
            if(check){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}