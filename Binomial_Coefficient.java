/*
n
 C
  r  = n!/ ( r! * (n-r)! )

 */

import java.util.Scanner;

public class Binomial_Coefficient {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt();

        System.out.println(binCoeff(n, r));
    }

    static int binCoeff(int n, int r)
    {
        int n_fact = factorial(n);
        int r_Fact = factorial(r);
        int nmr_fact = factorial(n-r);

        // apply formula
        return n_fact / ( r_Fact * nmr_fact);

    }

    // calculating factorial
    static int factorial(int n){
        int fact =1;
        for(int i=n;i>=2;i--){
            fact = fact*i;
        }
        return fact;
    }

}
