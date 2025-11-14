import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Strivers A2Z Sheet (Arrays -> Medium)
    Leetcode - 169

    Example:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
 */
public class _17_MajorityElement1 {
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
        int majorityElement = majorityElement(nums);
        System.out.println("Majority Element [n/2] is: "+majorityElement);
    }

    public static int majorityElement(int[] nums)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int element=-1, maxCnt = 0;
        for(Map.Entry<Integer,Integer> pair : mp.entrySet())
        {
            if(pair.getValue()>maxCnt){
                maxCnt = pair.getValue();
                element = pair.getKey();
            }
        }
        boolean isMajority = maxCnt > nums.length/2;
        return isMajority ? element : -1;
    }
}
