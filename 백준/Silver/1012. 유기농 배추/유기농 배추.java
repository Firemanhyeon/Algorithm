import java.util.*;

public class Main {
    static int[] nx={1,-1,0,0};
    static int[] ny={0,0,-1,1};
    static int[][] field ;
    static int[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            int answer=0;
            int x = sc.nextInt();
            int y =sc.nextInt();
            int num=sc.nextInt();

            field=new int[y][x];
            visited= new int[y][x];
            for(int j=0;j<num;j++){
                int py = sc.nextInt();
                int px = sc.nextInt();
                field[px][py] = 1;
            }
            for(int k=0;k<y;k++){
                for(int z=0;z<x;z++){
                    if(field[k][z]==1 && visited[k][z]==0){
                        answer++;
                        dfs(k,z);
                    }
                }
            }
            arr[i]=answer;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void dfs(int x , int y){
        visited[x][y]=1;
        for(int i=0;i<4;i++){
            int newX = x+nx[i];
            int newY = y+ny[i];
            if(newX < 0 || newX > field.length-1 || newY<0 || newY>field[0].length-1){
                continue;
            }
            if(visited[newX][newY]==0 && field[newX][newY]==1){
                dfs(newX,newY);
            }
        }
    }
}