// find minimum number.
public class MinNumber {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 7, 3, 4, 14, -28 };
        System.out.println(min(arr));
    }

    // return minimum value in array
    static int min(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal)
                minVal = arr[i];
        }
        return minVal;

    }

}
