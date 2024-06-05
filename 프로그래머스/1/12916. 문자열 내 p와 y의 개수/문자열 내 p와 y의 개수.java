// import java.util.stream.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // int p = 0;
        // int y =0;
        // char[] ch = s.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     ch[i] = Character.toLowerCase(ch[i]);
        //     if(ch[i]=='p'){
        //         p++;
        //     }
        //     if(ch[i]=='y'){
        //         y++;
        //     }
        // }
        // if(p!=y){
        //     answer=false;
        // }
 
        Long p = s.toLowerCase().chars().filter(i-> i=='p').count();
        Long y = s.toLowerCase().chars().filter(i-> i=='y').count();
        
        return p==y;
    }
}