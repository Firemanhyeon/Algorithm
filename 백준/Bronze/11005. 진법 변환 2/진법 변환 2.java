import java.util.*;

public class Main{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = scanner.nextInt();
        String a = Integer.toString(number , num).toUpperCase();

        System.out.println(a);
    }
}