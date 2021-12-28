// Java program for above implementation

public class remstrateroccofseq
{
    // Method to print the string
    static void printString(String str, char ch, int count)
    {
        int occ = 0, i;
    
        // If given count is 0
        // print the given string and return
        if (count == 0) {
            System.out.println(str);
            return;
        }
    
        // Start traversing the string
        for (i = 0; i < str.length(); i++) {
    
            // Increment occ if current char is equal
            // to given character
            if (str.charAt(i) == ch)
                occ++;
    
            // Break the loop if given character has
            // been occurred given no. of times
            if (occ == count)
                break;
        }
    
        // Print the string after the occurrence
        // of given character given no. of times
        if (i < str.length() - 1)
            System.out.println(str.substring(i + 1));
    
        // Otherwise string is empty
        else
            System.out.println("Empty string");
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "smvdu";
        printString(str, 'v', 1);
    }
}