import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		
		for(int i =1; i<=T;i++) {
			int sum=0;
			int A= scanner.nextInt();
			int B= scanner.nextInt();
			sum=A+B;
			System.out.println("Case #"+i+":"+" "+sum);
			
		}
		
	}

}
