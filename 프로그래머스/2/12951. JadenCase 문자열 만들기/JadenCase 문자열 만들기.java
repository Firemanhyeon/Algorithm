import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1); // Keep trailing spaces

        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
                char ch = Character.toUpperCase(arr[i].charAt(0));
                String left = arr[i].substring(1).toLowerCase();
                answer += ch+left;
            }
            if(arr.length-1>i){
                answer+=" ";
            }
            
        }
        return answer;
    }
}