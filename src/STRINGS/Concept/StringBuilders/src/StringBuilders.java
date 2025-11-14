public class StringBuilders {
    public static void main(String[] args) {
        // Declaration with Initialization
        // Note: Default Constructor allows initial capacity of 16
        StringBuilder sb1 = new StringBuilder(24);
        StringBuilder sb2 = new StringBuilder("string");

        // Append
        System.out.println(sb2.append(" hi"));

        // Insert
        System.out.println(sb2.insert(3, "cvv"));

        // Delete
        System.out.println(sb2.delete(3,6));

        // Reverse
        System.out.println(sb2.reverse());

        // Replace (Exclusive)
        System.out.println(sb2.replace(2,5,"hello"));

        // charAt(index)
        // setCharAt(index, Char)
        // deleteCharAt(index)

        // length()
        // capacity()
        // substring(startIndex,endIndex)(Inclusive)
        System.out.println(sb2.substring(4, 8));

        // To String
        System.out.println(sb2.toString());







    }
}
