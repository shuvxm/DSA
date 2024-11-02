// package NumberProgram;

public class EvenOdd {
    public static void main(String[] args) {
        int nums = 321;
        evenOdd(nums);
    }

    static void evenOdd(int nums) {
        if (nums % 2 == 0)
            System.out.println("The number " + nums + " is even");
        else
            System.out.println("The number " + nums + " is odd");
    }
}
