package pattern.questions;
/*
Inverted Half pyramid with numbers like
12345
1234
123
12
1
 */
public class Prgm6 {
    static void inverted_half_Pyramid(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<= totRows-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_Pyramid(5);
    }
}
