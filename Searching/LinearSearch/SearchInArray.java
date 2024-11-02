// package Searching.LinearSearch;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = { 18, 23, 45, -11, 6, 10, 34 };
        int target = -11;
        System.out.println(linearSearch(arr, target));
    }

    // search in the array: return index if item found
    // otherwise if item not found return -1.
    static int linearSearch(int[] arr, int target) {

        // edge cases
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }
        return -1; // target not found
    }
}
