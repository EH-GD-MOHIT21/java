import java.util.Scanner;

public class halfofnumafterlastodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0, count = 0;
        int z = 0;
        while (x > 0) {
            y = x % 10;
            if (y % 2 != 0) {
                break;
            }
            x = x / 10;
            z = (int) (z + y * Math.pow(10, count));
            count++;
        }
        z = z / 2;
        x = (int) (x * Math.pow(10, count));
        x = (x + z) * 3;
        System.out.println(x);

    }
}