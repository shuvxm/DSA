public class SearchInRange {
    public static void main(String[] args) {
        // int[] arr = { 18, 23, 45, -11, 6, 10, 34 };
        int[] arr = {};
        int target = 6;
        System.out.println(searchInRange(arr, target, 1, 4));

    }

    static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {
        // edge cases
        if (arr.length == 0)
            return -1;

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

}
