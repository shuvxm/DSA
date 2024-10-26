/*
 * WAF to calculate sum & product of all numbers in an array.
 */

public class Sum_Product {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 6 };
        System.out.println(sum_product(nums));

    }

    public static String sum_product(int[] nums) {
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            prod *= nums[i];
        }
        return "sum= " + sum + "\nproduct = " + prod;
    }

}
