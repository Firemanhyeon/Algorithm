
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		if(N<100) {
			System.out.println(N);
		}else if(N>=100) {
			result = 99;
			for(int i=100;i<=N;i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				if((hun-ten)==(ten-one)) {
					result++;
				}
				
			}
			System.out.println(result);
		}
		
	}

}
