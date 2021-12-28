import java.util.Scanner;

public class seconddigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0, z = 0;
        while (x > 99) {
            x = x / 10;
            y = x % 10;
        }
        System.out.println("Second digit is =" + y);
    }
}