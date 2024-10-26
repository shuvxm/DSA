package pattern.questions;
/*
print Inverted & Rotated Half-pyramid
   *
  **
 ***
****

 */
public class Prgm5 {
    public static void inverted_rotated_HalfPyramid(int totRows){
        // outer-> 1 to 4 times
        for(int i=1; i<= totRows;i++){
            // spaces -> 4-i
            for(int k=1; k<=totRows-i; k++){
                System.out.print(" ");
            }
            // star-> i= star (directly proportional)
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_HalfPyramid(6);
    }

}
