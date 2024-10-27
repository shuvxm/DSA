package BinaryConversion;

public class Exm1 {
    public static void main(String[] args) {
        int decNum = 42;
        decimalToBinary(decNum);

        // for(int i=0; i<10;i++){
        // decimalToBinary(i);
        // }
    }

    static void decimalToBinary(int decNum) {
        int ans = 0;
        int pow = 1;
        int rem;
        while (decNum > 0) {
            rem = decNum % 2;
            decNum /= 2;
            ans += rem * pow;
            pow = pow * 10;
        }
        System.out.println(ans);
    }
}
