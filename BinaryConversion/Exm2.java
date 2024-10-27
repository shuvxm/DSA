package BinaryConversion;

public class Exm2 {
    public static void main(String[] args) {
        int binNum = 101010; // 42
        binaryToDecimal(binNum);
    }

    static void binaryToDecimal(int binNum) {
        int ans = 0;
        int pow = 1;
        while (binNum > 0) {
            int rem = binNum % 10;
            ans += rem * pow;

            pow *= 2;
            binNum /= 10;

        }
        System.out.println(ans);
    }
}
