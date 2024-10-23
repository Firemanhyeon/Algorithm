import java.util.*;

class Solution {
    static Set<String> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        
        dfs("", numbers);
        for(String str : set){
            if(str.startsWith("0")) continue;
            if(chk(Integer.parseInt(str))){
                answer++;
            }
        }
        return answer;
    }
    public static void dfs(String current , String remain){
        if(!current.isEmpty()){
            set.add(current);
        }
        
        for(int i=0;i<remain.length();i++){
            dfs(current+remain.charAt(i) , 
               remain.substring(0,i) + remain.substring(i+1));
        }
    }
    public static boolean chk(int num ){
        
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}