import java.util.*;

public class capscharatoddindex {
    static String removeOddIndexCharacters(String s)
    {
        String new_string = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1){
            new_string += s.charAt(i);
            }
            else{
            String st = Character.toString(s.charAt(i));
            new_string = new_string.concat(st.toUpperCase()); 
        }}

        return new_string;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // Remove the characters which
        // have odd index
        str = removeOddIndexCharacters(str);
        System.out.print(str);
    }
}