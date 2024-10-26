public class Subarray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };

        for (int start = 0; start <= num.length; start++) {
            for (int end = start; end <= num.length; end++) {
                for (int i = start; i < end; i++) {
                    System.out.print(num[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
