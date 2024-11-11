import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]= Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[arr2.length-1]);
        answer+=arr2[0];
        answer+=" ";
        answer+=arr2[arr2.length-1];
        return answer;
    }
}