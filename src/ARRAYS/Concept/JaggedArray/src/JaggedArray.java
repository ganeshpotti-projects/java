import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        // It is a Multi-Dimensional Array with Different No.of Columns in a row.

        // Declaration with Initialization
        int [][] mul = new int[4][];
        mul [0] = new int [4];
        mul [1] = new int [3];
        mul [2] = new int [2];
        mul [3] = new int [1];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements into Jagged Array: ");

        // Assigning Values
        for(int i=0; i<mul.length;i++)
        {
            for(int j=0;j<mul[i].length;j++)
            {
                mul[i][j] = sc.nextInt();
            }
        }

        // Print using for
        for(int i=0;i<mul.length;i++)
        {
            for(int j=0;j<mul[i].length;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

        // Print using for-each loop
        for(int [] row : mul)
        {
            for(int ele : row)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
