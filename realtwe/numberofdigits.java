import java.util.Scanner;

public class numberofdigits {
    public static void main(String args[]) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            x = x / 10;
            n++;
        }
        System.out.println("Number of digits in given number are :- " + n);
    }
}