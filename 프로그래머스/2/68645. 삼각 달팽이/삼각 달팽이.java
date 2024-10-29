import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] triangle = new int[n][n];
        int cnt=1;
        int row=0;
        int col=0;
        //아래 , 오른쪽 , 왼쪽위
        int[] dr = {1,0,-1};
        int[] dc = {0,1,-1};
        
        int direct =0;
        
        while(cnt<= n*(n+1)/2){
            triangle[row][col] = cnt++;
            
            int nr = dr[direct]+ row;
            int nc = dc[direct]+ col;
            
            if(nr >= n || nc >= n || nr < 0 || nc < 0 || triangle[nr][nc] != 0){
                direct = (direct+1)%3;
                nr = row+ dr[direct];
                nc = col+ dc[direct];
            }
            
            row = nr;
            col = nc;
        }
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(triangle[i][j]!=0){
                    list.add(triangle[i][j]);
                }
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}