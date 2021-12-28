import java.util.Scanner;

public class sonumbersconsdigit {
  public static void main(String args[]) {
    int y = 0, z = 0, sum = 0, m = 0;
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    while (x > 9) {
      y = x % 10;
      x = x / 10;
      z = x % 10;
      m = z * 10;
      sum = sum + y + m;
    }
    System.out.println("sum of numbers formed by consecutiv digits=" + sum);
  }
}