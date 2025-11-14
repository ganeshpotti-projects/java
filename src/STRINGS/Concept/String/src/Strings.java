import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration
        String str1;

        // Initialization
        str1 = "hello";

        // Declaration with Initialization
        String str2 = "hello";
        String str3 = new String("hih hello");
        String str4 = new String("hih hello");

        // Accessing
        System.out.println(str4.indexOf("h"));
        System.out.println(str4.lastIndexOf("h"));
        System.out.println(str4.charAt(4));

        // Printing
        for(char ch: str4.toCharArray())
        {
            System.out.print(ch+" ");
        }
        System.out.println();

        // Length
        System.out.println(str4.length());

        // Upper & Lower Case
        System.out.println(str4.toUpperCase() + " "+ str4.toLowerCase());

        // Comparing(Reference) == & equals(Value)
        System.out.println(str4==str3);
        System.out.println(str4.equals(str3));
        System.out.println(str2==str1);
        System.out.println(str2.equals(str1));
        // Note: new Keyword creates a separate reference for every object created in heap.
        // Whereas literal assignment will point to same reference if Value already exists in the pool.

        // Trim
        String str5 = "     Hello who is this    ";
        System.out.println(str5.trim());

        // Concat
        String str6 = "hello";
        String str7 = "hi";
        System.out.println(str6.concat(str7));
        System.out.println(str6+ " "+ str7);
        // Note: Number + Number = Number but String + Number = String

        // Special Characters
        // Note: \', \", \\, \t, \b, \n
    }
}
