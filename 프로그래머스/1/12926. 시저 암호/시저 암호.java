class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if((int)ch[i]>=65 && (int)ch[i]<=90 || ch[i]>=97 && ch[i]<=122){
                if((int)ch[i]+n>90 && (int)ch[i]<97){// 대문자 z 넘어가는경우 , 소문자는 아니어야함
                    int num = (int)ch[i]+n-90;
                    ch[i]=(char)(num+64);
                }else if((int)ch[i]+n>122 ){//소문자 z 넘어가는경우
                    int num = (int)ch[i]+n-122;
                    ch[i]=(char)(num+96);
                }else{
                    ch[i] = (char) ((int)ch[i]+n);
                }
            }
        }
        answer = new String(ch);
    //65~90대문자
    //97~122소문자
        return answer;
    }
}