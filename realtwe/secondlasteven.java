import java.util.Scanner;

public class secondlasteven {
    public static void main(String args[]) {
        int y = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = 0;
        while (x != 0) {
            d = x % 10;
            if (d % 2 == 0) {
                y++;
            }
            x = x / 10;
            if (y == 2) {
                System.out.println("The second last even digit is:" + d);
                break;

            }

        }
    }
}