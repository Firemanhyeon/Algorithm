import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] visited;
    static int[] px={0,0,1,-1};
    static int[] py = {1,-1,0,0};
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        arr = new int[length][width];
        visited = new int[length][width];
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                if(visited[i][j]!=1 && arr[i][j]==1){
                    cnt++;
                    int val = dfs(i,j,0);
                    if(answer<val){
                        answer=val;
                    }
                }
            }
        }
        System.out.println(cnt);
        System.out.println(answer);
    }
    static int dfs(int x,int y, int result){
        result++;
        visited[x][y]=1;
        for(int i=0;i<4;i++){
            int nx = x+px[i];
            int ny = y+py[i];
            if(nx <= -1 || nx >= arr.length || ny <= -1 || ny >= arr[0].length) continue;
            if(visited[nx][ny]==0 && arr[nx][ny]==1){

                result = dfs(nx,ny,result);
            }
        }
        return result;
    }

}