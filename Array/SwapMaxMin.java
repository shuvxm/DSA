public class SwapMaxMin {
    public static void main(String[] args) {
        int[] nums = { 3, 2, -4, 5, 6, -2 };
        System.out.println("Original array: ");
        printArray(nums);

        // Get indices of max and min values
        int maxIndex = maxIndex(nums);
        int minIndex = minIndex(nums);

        // swap the max & min elements
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;

        System.out.println("Array after swapping min and max: ");
        printArray(nums);
    }

    public static int minIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

}
