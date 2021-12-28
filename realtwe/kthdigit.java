import java.util.Scanner;

public class kthdigit {
    public static void main(String args[]) {
        int m = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            m = x % 10;
            x = x / 10;
        }
        System.out.println(y + "th digit from last is =" + m);
    }
}