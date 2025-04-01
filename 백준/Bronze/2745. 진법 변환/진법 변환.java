import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str = scanner.next();
        int num = scanner.nextInt();
        
        int len = str.length()-1;
        int sum=0;
		for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //숫자인경우
            int value =0;
            if(ch >= '0' && ch <= '9'){
                value = ch-'0';
            }
            //문자인경우
            else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' +10;
            }
            sum+= value * Math.pow(num,len);
            len--;
        }
        System.out.println(sum);
	}

}