package ArrayPrev;
/*
largest element in array
 */
public class _01Largest {
    public static void main(String[] args) {
        int[] array = {3,2,1,5,2};
        int largest = array[0];
        for(int i=0; i<array.length;i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}
