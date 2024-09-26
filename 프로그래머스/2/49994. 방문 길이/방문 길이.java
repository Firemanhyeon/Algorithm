import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int x=0;//처음위치
        int y=0;//처음위치
        int[] dx={1,-1,0,0};//UDRL
        int[] dy={0,0,1,-1};
        char[] chars = {'U','D','R','L'};
        for(char ch : dirs.toCharArray()){
            int idx=-1;
            for(int i=0;i<chars.length;i++){
                if(ch==chars[i]){
                    idx=i;
                    break;
                }
            }
            
            int nx = x+dx[idx];
            int ny = y+dy[idx];
            
            if(nx>5 || nx<-5 || ny>5 || ny<-5){
                continue;
            }
            //양방향고려해서 두개 저장해야함
            String path1 = x+","+y+"->"+nx+","+ny;
            String path2 = nx+","+ny+"->"+x+","+y;
            
            if (!set.contains(path1) && !set.contains(path2)) {
                set.add(path1);
                set.add(path2);
            }
            
            
            x=nx;
            y=ny;
        }
        return set.size()/2;
    }
}