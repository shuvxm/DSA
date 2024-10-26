/*
 * Maximum sub array sum optimised way = Kdane's Algo
 */
public class KdanesAlgo {
    public static void main(String[] args) {
        int[] nums = { 3, -4, 5, 4, -1, 7, -8 };
        basicApproach(nums);
        Kdanes(nums);
    }

    // brute force approach -> Time complexity is O(n^2)
    public static void basicApproach(int[] nums) {
        int maxSum = 0;
        for (int start = 0; start < nums.length; start++) {
            int currSum = 0;

            for (int end = start; end < nums.length; end++) {
                currSum += nums[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println(maxSum);
    }

    // most optimized -> Time complexity is O(n)
    public static void Kdanes(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("By kdanes algo, finding max subarray sum : " + maxSum);
    }
}
