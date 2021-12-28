import java.util.Scanner;

public class numberofevendig {
    public static void main(String args[]) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            m = x % 10;
            if (m % 2 == 0) {
                n++;
            }
            x = x / 10;
        }
        System.out.println("Number of even digits in given number are :- " + n);
    }
}