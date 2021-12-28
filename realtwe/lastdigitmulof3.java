import java.util.Scanner;

public class lastdigitmulof3 {
    public static void main(String args[]) {
        int y = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            y = x % 10;
            if (y % 3 == 0) {
                System.out.println("The last digit, which is multiple of 3 is :-" + y);
                break;
            }
            x = x / 10;
        }
    }
}