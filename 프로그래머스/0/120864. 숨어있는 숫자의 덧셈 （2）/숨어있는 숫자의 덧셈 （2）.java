class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] chars = my_string.toCharArray();
        StringBuilder str= new StringBuilder();
        for(int i=0;i<chars.length;i++){
            str.delete(0,str.length());
            if((int)chars[i]<=58 && (int)chars[i]>=47){
                str.append(chars[i]);
                while(i+1<chars.length &&(int)chars[i+1]<=58 && (int)chars[i+1]>=47){

                    str.append(chars[i+1]);
                    i++;


                }
                answer+=Integer.parseInt(String.valueOf(str));
            }
        }
        return answer;
    }
}