package pattern.questions;
/*
floyd's Triangle:
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15

 */
public class Floyds_Triangle {
    static void floyd_triangle(int totRows){
        int counter=1;
        for(int i=1; i<= totRows; i++){
            for(int j=1; j<= i; j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_triangle(5);
    }
}
