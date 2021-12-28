import java.util.Scanner;

public class digitafterlasteven {
    public static void main(String args[]) {
        int y = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println("The digit immediately after the last even digit=" + y);
                break;
            }
            y = x % 10;
            x = x / 10;
        }

    }
}