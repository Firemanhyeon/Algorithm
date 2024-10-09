
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int countPerDanji;
	static int[][] arr;
	static int[][] visited;
	static int dirY[] = {1 , -1 , 0 , 0};
	static int dirX[] = {0 , 0 , 1 , -1};
	
	
	static void DFS(int y, int x) {
		countPerDanji++;
		visited[y][x] = 1;
		
		for(int i=0; i<4;i++) {
			int newY = y+dirY[i];
			int newX = x+dirX[i];
			if(visited[newY][newX]==0 && arr[newY][newX]==1) {
				DFS(newY , newX);
			}
		}
	}
	
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		arr = new int[35][35];
		visited = new int[35][35];
		
		for(int i=1;i<=N;i++) {
			String input = sc.next();
			for(int j=1;j<=N;j++) {
				arr[i][j] = input.charAt(j-1)-'0';
			}
		}
		ArrayList<Integer> countList = new ArrayList<>();
		for(int i=1; i<=N;i++) {
			for(int j=1; j<=N;j++) {
				if(arr[i][j]==1 && visited[i][j]==0) {
					countPerDanji = 0;
					DFS(i,j);
					countList.add(countPerDanji);
				}
			}
		}
		System.out.println(countList.size());
		Collections.sort(countList);
		
		for(int i=0;i<countList.size();i++) {
			System.out.println(countList.get(i));
		}
		
	}

	

}
