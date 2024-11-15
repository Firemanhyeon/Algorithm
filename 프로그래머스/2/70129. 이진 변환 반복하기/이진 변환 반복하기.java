import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder str = new StringBuilder(); 
        List<Integer> list = new ArrayList<>();
        int cnt =0;
        int num=0;
        while(true){
            str = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    str.append(s.charAt(i));
                }else if(s.charAt(i)=='0'){
                    cnt++;
                }
            }
            num++;
            s=Integer.toBinaryString(str.toString().length());
            if(s.equals("1")){
                break;
            }
        }
        answer[0]=num;
        answer[1]=cnt;
        return answer;
    }
}