package pattern.questions;
/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */
public class _0_1_Triangle {
    static void _01Triangle(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for(int j=1; j<=i;j++){
                if( (i+j)%2 == 0){  // even
                    System.out.print("1");
                }else { //odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        _01Triangle(5);
    }
}
