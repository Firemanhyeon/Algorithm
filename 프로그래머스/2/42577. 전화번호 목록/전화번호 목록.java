import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1;i++){
            String num = phone_book[i];
            if(phone_book[i+1].startsWith(num)){
                return false;
            }
        }
        return answer;
    }
}