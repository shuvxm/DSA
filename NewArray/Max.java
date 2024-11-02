//5
public class Max {
    public static void main(String[] args) {
        int[] arr = { 12, 24, 5, 7, 34, 9 };

        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 4));
    }

    static int max(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int startIndex, int endIndex) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = startIndex; i <= endIndex; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
