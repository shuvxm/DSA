package pattern.questions;
/*

 */
public class ButterflyPattern {

    static void butterfly(int n){
        // outer -> from 1 to 4
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
//            for(int k=1; k)
        }
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
