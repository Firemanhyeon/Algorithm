import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-"
                ,"...-",".--","-..-","-.--","--.."};
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<String , Character> map = new HashMap<String, Character>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],chars[i]);
        }
        String [] starr = letter.split(" ");
        for(int i=0;i< starr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(starr[i].equals(arr[j])){
                    answer.append(chars[j]);
                }
            }
        }
        
        return answer.toString();
    }
}