import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[][] a = new int[9][9];
		int max=0;
		int first=0;
		int second=0; 
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a[i][j]=sc.nextInt();
				if(i==0 && j == 0) {
				}
				if(max<=a[i][j]) {
					max=a[i][j];
					first=i+1;
					second=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(first+" "+second);
		
	}
}