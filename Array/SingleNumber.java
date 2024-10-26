/*
 * Given a non-empty array of integers nums, every element 
 * appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity 
    and use only constant extra space.

Input: nums = [2,2,1]
Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2, 1 };
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int val : nums) {
            ans = ans ^ val;
        }
        return ans;
    }

}
