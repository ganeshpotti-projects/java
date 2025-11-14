import java.util.Scanner;

/*
    Strivers A2Z Sheet (Arrays -> Easy)

    Example:
    Input: nums = [3,4,5,1,2]
    Output: [5,1]
 */

public class _01_largestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements into Array: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] elements = getLargestAndSmallestElement(arr);
        System.out.println("Largest Element is: "+elements[0]);
        System.out.println("Smallest Element is: "+elements[1]);
    }

    public static int[] getLargestAndSmallestElement(int[] arr)
    {
        int[] res = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        for(int i=0;i< arr.length;i++)
        {
            res[0] = Math.max(res[0], arr[i]);
            res[1] = Math.min(res[1], arr[i]);
        }
        return res;
    }
}
