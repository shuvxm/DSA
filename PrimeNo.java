import java.util.Scanner;

public class PrimeNo {

    // only for n>=2
//    static boolean isPrime(int n){
//        if(n == 2)
//            return true;
//        for(int i=2; i<= n-1;i++){
//            if(n%i==0)
//                return false;
//        }return true;
//
//    }

    // optimised way...
    static boolean isPrime(int n){
        if(n==2)
            return true;
        for(int i=2; i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }return true;
    }

    static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        primeInRange(number);
    }
}
