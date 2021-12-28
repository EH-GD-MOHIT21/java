import java.lang.String;
public class stringclass {
    public static void main(String[] args) {
        String str = "Softwaretestinghelp";
        String str1 = "testing";
        String str2 = "blog";
        System.out.println("testing is a part of Softwaretestinghelp: " + str.contains(str1));
        System.out.println("blog is a part of Softwaretestinghelp: " + str.contains(str2));  
    }

}