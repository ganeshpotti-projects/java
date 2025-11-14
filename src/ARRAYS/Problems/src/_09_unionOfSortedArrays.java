/*
    Strivers A2Z Sheet (Arrays -> Easy)

    Example:
    Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
    Output: [1, 3, 4, 5, 6, 7, 8, 9]
    Explanation:
    The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _09_unionOfSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Elements in Array1: ");
        int m = sc.nextInt();
        System.out.println("Enter Elements into Array1: ");
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter No.of Elements in Array2: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements into Array2: ");
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] unionArr = unionArray(nums1, nums2);
        System.out.println("Union of 2 Arrays: ");
        for (int ele : unionArr) {
            System.out.print(ele + " ");
        }
    }

    public static int[] unionArray(int[] nums1, int[] nums2)
    {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums1)
        {
            set.add(ele);
        }
        for(int ele : nums2)
        {
            set.add(ele);
        }
        int[] res = new int[set.size()];
        int i=0;
        for(int ele : set)
        {
            res[i++] = ele;
        }
        return res;
    }
}