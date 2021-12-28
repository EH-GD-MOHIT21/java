import java.util.Scanner;

public class positionalvalue {
    public static void main(String args[]) {
        int m = 0, n = 1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Positional Values of the give number are :-");
        while (x > 0) {
            m = x % 10;
            m = m * n;
            System.out.print(m + ",");
            n = n * 10;
            x = x / 10;
        }

    }
}