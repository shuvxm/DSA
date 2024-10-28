package MockProgram;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13 };

        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == a[i] + 1) {
                count++;
                System.out.println(count);
            }
            else{
                
            }
        }

    }
}
