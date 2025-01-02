/* 
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

/* Complexity:
Time Complexity: 𝑂(𝑛2) due to the nested loops.
Space Complexity: 𝑂(1) as no additional data structures are used. 
*/
class TwoSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // The problem specifies that there is exactly one solution, so throwing an
        // exception if no solution is found makes sense.
        // If the loop completes without finding a solution (though the problem
        // guarantees one), an exception is thrown.
        // throw new IllegalArgumentException("No two sum solution");
        // or
        return new int[] {};
    }
}

/*
 Efficient approach to solve:
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

 */