import java.util.Scanner;

public class sonumexchangeconsdigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0, z = 0, m = 0, sum = 0;
        while (x > 9) {
            y = x % 10;
            x = x / 10;
            z = x % 10;
            y = y * 10;
            sum = sum + y + z;
        }
        System.out.println("Sum of numbers formed by exchanging consecutive digits=" + sum);
    }

}