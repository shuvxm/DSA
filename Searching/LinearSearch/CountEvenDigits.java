public class CountEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 18, 124, 9, 1764, 98, -1000 };
        System.out.println(findNumbers(nums));

        System.out.println(digit2(-345678));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        /*
         * for (int i = 0; i < nums.length; i++) {
         * if (even(nums[i]))
         * count++;
         * }
         */
        for (int num : nums) {
            if (even(num))
                count++;
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
         * if (numberOfDigits % 2 == 0)
         * return true;
         * return false;
         */
        return numberOfDigits % 2 == 0;
    }

    // optimal way to find count of digit
    static int digit2(int num) {
        if (num < 0)
            num = num * -1;
        return (int) (Math.log10(num)) + 1;
    }

    // count number of digits
    static int digits(int num) {
        // edge cases
        if (num < 0)
            num = num * -1;
        if (num == 0)
            return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
