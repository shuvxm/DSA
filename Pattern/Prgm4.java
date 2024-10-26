package pattern.questions;
/*
print Hollow Rectangle Pattern
* * * * *
*       *
*       *
* * * * *

 */

public class Prgm4 {
    public static void hollow_Rectangle(int totRows, int totCols) {
        // total rows =4 so outer lopp traverse from 1st rows to 4th rows
        for(int row=1; row <= totRows; row++){
            // inner-cols
            for(int col=1; col <= totCols; col++){
                //cell- (i,j)
                if(row==1 || row==totRows || col==1 || col==totCols){
                    //printing boundary cells
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hollow_Rectangle(4,5);

    }
}
