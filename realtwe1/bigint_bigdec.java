import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigint_bigdec {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    java.math.BigInteger a=new BigInteger(sc.next());
    java.math.BigInteger b=new BigInteger(sc.next());
    System.out.println("Addition of big ints :" +a.add(b));
    System.out.println("mul of big ints "+a.multiply(b));
    BigDecimal c = new BigDecimal(sc.next());
    BigDecimal d = new BigDecimal(sc.next());
    System.out.println("Addition of big decimals :" +c.add(d));
    System.out.println("mul of big ints "+c.multiply(d));
    }
}