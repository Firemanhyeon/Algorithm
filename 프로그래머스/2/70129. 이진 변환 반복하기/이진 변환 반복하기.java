import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int lng=0;//0제거후 길이
        String change=s;//이진법 변환
        int cnt=0;//0제거한 숫자
        int count=0;
        //0제거   
        while(!change.equals("1")){
            List<Character>list = new ArrayList<>();
            for(int i=0;i<change.length();i++){
                if(change.charAt(i)!='0'){
                    list.add(change.charAt(i));
                }else{
                    cnt++;
                }
            }
            //0제거후 길이
            lng = list.size();

            //이진변환
            change = Integer.toBinaryString(lng);
            count++;
        }
        answer[0]=count;
        answer[1]=cnt;
        return answer;
    }
}