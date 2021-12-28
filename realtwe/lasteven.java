import java.util.Scanner;

public class lasteven {
    public static void main(String args[]) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            m = x % 10;
            if (m % 2 == 0) {
                System.out.println("Last even digit in given number is :- " + m);
                break;
            }
            x = x / 10;
        }

    }
}