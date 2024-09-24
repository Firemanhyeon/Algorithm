import java.util.*;

class Solution {
    static int answer = 0;
    static Map<String,Integer> map = new HashMap<>();
    static int cnt=1;
    static char[] chars = {'A','E','I','O','U'};
    public int solution(String word) {
        StringBuilder str = new StringBuilder();
        dfs(str);
        return map.get(word);
    }
    public static void dfs(StringBuilder str){
        if(str.length()>4){
            return;
        }
        for(int i=0;i<chars.length;i++){
            str.append(chars[i]);

            map.put(str.toString(),cnt++);
            dfs(str);
            str.deleteCharAt(str.length()-1);
        }
    }
}