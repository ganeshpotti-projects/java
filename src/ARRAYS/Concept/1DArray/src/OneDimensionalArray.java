import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {

        // It allows to store multiple values of same datatype.
        // Indexing starts from 0 to arr.length-1
        // Contiguous memory Allocation

        // Array Declaration
        int [] arr1, arr2;

        // Array Initialization
        arr1 = new int[4]; // fills with default value 0
        arr2 = new int[]{1,2,3,4,5}; // fills the specified values

        // Array Declaration with Initialization
        int [] arr3 = {1,2,3,4,5};
        int [] arr4 = new int[4];

        // Allowing command line Arguments
        Scanner sc = new Scanner(System.in);

        // Assigning Values
        System.out.println("Enter "+ arr4.length+ " elements into Array: ");
        for(int i = 0; i < arr4.length; i++)
        {
            arr4[i] = sc.nextInt();
        }

        // Printing Array using for loop
        for(int i=0;i<arr4.length;i++)
        {
            System.out.print(arr4[i]+" ");
        }

        System.out.println();

        // Printing Array using for-each loop
        for(int ele : arr4)
        {
            System.out.print(ele+" ");
        }

        System.out.println();

        // Accessing specific Index
        System.out.println("Value of Index 2: "+arr4[2]);

        // Array Length
        System.out.println("Length: "+arr4.length);


    }
}
