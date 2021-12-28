import java.util.Scanner;

public class soevendigit {
    public static void main(String args[]) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            m = x % 10;
            if (m % 2 == 0) {
                n = n + m;
                x = x / 10;
            }
            x = x / 10;
        }
        System.out.println("Sum of even digits of given number :-" + n);
    }
}