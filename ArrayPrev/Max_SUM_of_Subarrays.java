package ArrayPrev;

public class Max_SUM_of_Subarrays
{
    static void maxSubarraysSum(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i< numbers.length;i++){ // to get start
            int start = i;
            for(int j=i; j< numbers.length;j++){ // to get end
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++)
                {
                    // subarray sum
                    currSum+=numbers[k];
                }
                System.out.println("Current sum of this subarray is:"+currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubarraysSum(numbers);
    }
}
