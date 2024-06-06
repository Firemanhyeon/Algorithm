import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==0){
                answer+=" ";
            }else{
                arr[i]= arr[i].toLowerCase();
                char ch = Character.toUpperCase(arr[i].charAt(0));
                answer+= ch+arr[i].substring(1);
                if(i<arr.length-1){
                    answer+=" ";
                }

            }
        }
        int idx=0;
        int idx1=1;
        while(s.substring(s.length()-idx1,s.length()-idx).equals(" ")){
            answer+=" ";
            idx++;
            idx1++;
        }
        return answer;
    }
}