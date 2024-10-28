package ArrayPrev;

/*
check if the array is sorted or not
 */
public class _03Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4 };
        System.out.println(checkSorted(arr));

    }

    static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i]) {
            } else
                return false;
        }
        return true;
    }
}
