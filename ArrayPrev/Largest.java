package ArrayPrev;

public class Largest {
    static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // infinity
        
        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > largest)
                largest = numbers[i];
            if(numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("smallest is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,-4,3,5};
        System.out.println(getLargest(numbers));
    }
}
