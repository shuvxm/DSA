// package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 86 };
        int target = 86;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the mid element
            // int mid = (start + end )/2; // this may exceeds the int range for big number
            int mid = start + (end - start) / 2; // finding mid index

            if (target < arr[mid]) {
                end = mid - 1; // check in left side of mid bcz target is smaller than mid element
            } else if (target > arr[mid]) {
                start = mid + 1; // check in right side of mid bcz target is larger than mid element
            } else {
                return mid; // ans found => target == arr[mid], so return mid index
            }
        }
        return -1;
    }
}
