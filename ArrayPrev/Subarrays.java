package ArrayPrev;

public class Subarrays {
    static void subarrays(int numbers[]){
       for(int i=0; i< numbers.length;i++){ // to get start
           int start = i;
           for(int j=i; j< numbers.length;j++){ // to get end
               int end = j;
               for(int k=start; k<=end; k++){
                   System.out.print(numbers[k]+" ");
               }
               System.out.println();
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
    }
}
