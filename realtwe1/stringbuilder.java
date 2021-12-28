import java.io.*;
public class stringbuilder{
    public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    StringBuilder sb = new StringBuilder(str);
    System.out.println("Enter the string ");
    String S=br.readLine();
    String st=S;
    String k="";
    int l=S.length();
    for(int i=l-1;i>=0;i--){
        k=k+S.charAt(i);
    }
    if(k==S){
        System.out.println("Pallindrome");
    }
    else{
        System.out.println("Not a pallindrome");
    }
    String su=S.toUpperCase();
    String sl=S.toLowerCase();
    System.out.println(su.equals(sl));
    char j='f';
    StringBuilder sr1=sb.insert(3,'n');
    String sr=S.replace(j,'n');
    String N="School";
    System.out.println(S.compareTo(N));
    System.out.println(N.substring(1,3));
    }
}