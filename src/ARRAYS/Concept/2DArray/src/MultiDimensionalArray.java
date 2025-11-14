import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // It is an Array storing arrays.

        // Declaration
        int [][] mul1;

        // Initialization
        mul1 = new int[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        // Declaration and Initialization
        int [][] mul2 = {{1,3,5}, {2,4,6}, {7,9,11}};
        int [][] mul3 = new int[][]{{1,3,5}, {2,4,6}, {7,9,11}};
        int [][] mul4 = new int[4][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter "+mul4.length*mul4.length+" elements into Multi Dimensional Array: ");

        // Assigning Values
        // Outer loop is defining No.of rows
        // Inner loop is defining No.of cols in a row

        for(int i=0;i<mul4.length;i++)
        {
            for(int j=0;j<mul4[i].length;j++)
            {
                mul4[i][j] = sc.nextInt();
            }
        }

        // Print using for loop
        for(int i=0;i<mul4.length;i++)
        {
            for(int j=0;j<mul4[i].length;j++){
                System.out.print(mul4[i][j]+" ");
            }
            System.out.println();
        }

        // Print using for each loop
        for(int[] row : mul4)
        {
            for(int ele : row)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        // Accessing the element
        System.out.println("Element at (2,2): "+mul4[2][2]);

        // No of Rows & Cols
        System.out.println("Number of Rows: "+mul4.length);
        System.out.println("Number of Cols: "+mul4[0].length);
    }
}
