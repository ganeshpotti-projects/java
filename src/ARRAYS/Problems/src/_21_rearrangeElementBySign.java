import java.util.Scanner;

/*
    Striver A2Z Sheet (Arrays -> Medium)
    Leetcode - 2149

    Example:
    Input: nums = [3,1,-2,-5,2,-4]
    Output: [3,-2,1,-5,2,-4]
    Explanation:
    The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
    The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
    Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect
    because they do not satisfy one or more conditions.
 */
public class _21_rearrangeElementBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements into Array: ");
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] rearrangedArray = rearrangeArray(nums);
        System.out.println("Array after rearrangement: ");
        for(int ele : rearrangedArray)
            System.out.print(ele+" ");
    }

    public static int[] rearrangeArray(int [] nums){
        int[] res = new int[nums.length];
        int i=0, j=1;
        for(int k=0;k<res.length;k++)
        {
            if(nums[k]>0) {
                res[i] = nums[k];
                i += 2;
            }else{
                res[j] = nums[k];
                j += 2;
            }
        }
        return res;
    }
}
