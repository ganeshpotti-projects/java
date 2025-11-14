import java.util.Scanner;

public class _19_printMaxSubarray {
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
        int[] maximumSubarray = printMaxSubarray(nums);
        System.out.println("Maximum Subarray is: ");
        for(int ele : maximumSubarray)
        {
            System.out.print(ele+" ");
        }
    }

    public static int[] printMaxSubarray(int[] nums)
    {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start=0, tempStart=0, end=0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if(sum<0) {
                sum = 0;
                tempStart = i+1;
            }
        }
        int[] res = new int[end-start+1];
        for(int i=start;i<=end;i++)
        {
            res[i-start] = nums[i];
        }
        return res;
    }

}
