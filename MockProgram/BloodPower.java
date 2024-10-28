import java.util.Arrays;

class BloodPower {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 5, 6, 7, 4, 3, 1 };
        int a = 0;
        int b = 0;
        Arrays.sort(arr);
        int l = arr.length - 1;
        for (int i : arr)
            b += i;
        while (b >= a) {
            a = a + arr[l];
            b = b - arr[l];
            l--;
        }
        System.out.println(a);
        System.out.println(b);
    }
}