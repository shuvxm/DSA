package ArrayPrev;

public class Sum_Subarrays {
    static void subarrays(int numbers[]){
        int currSum=0;

        for(int i=0; i< numbers.length;i++){ // to get start
            int start = i;
            for(int j=i; j< numbers.length;j++){ // to get end
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum+=numbers[k];
                }
                System.out.println("sum is:"+currSum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
    }
}
