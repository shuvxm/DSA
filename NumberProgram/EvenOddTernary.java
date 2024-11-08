package NumberProgram;

import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // using ternary operator
        // System.out.println((n % 2 == 0) ? n + " is even" : n + " is odd");

        // using switch statement
        switch (n % 2) {
            case 0:
                System.out.println(n + " is even");
                break;
            case 1:
                System.out.println(n + " is odd");
        }
    }
}
