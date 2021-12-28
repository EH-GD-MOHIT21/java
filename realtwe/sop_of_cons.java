import java.util.Scanner;

class sop_of_cons {
    public static void main(String args[]) {
        int y = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            y = (x % 10);
            x = x / 10;
            y = y * (x % 10);
            z = z + y;
        }
        System.out.println("Sum of conjugative digits of given number is = " + z);
    }
}