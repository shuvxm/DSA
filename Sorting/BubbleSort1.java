package Sorting;
/*
Worst-case Complexity: Both versions have a worst-case time complexity of
𝑂(𝑛2), but Version 2 can break out of the loop early if no swaps
are made, which makes it more efficient in practice.

Average-case Complexity: Version 2 is generally more efficient in
the average case because it reduces the number of comparisons and
swaps needed.
 */
public class BubbleSort1
{
// Version 1:
    // statically range of swapped
    static void bubbleSort1(int numbers[])
    {
        int temp; int count= 0;
        for(int i=0; i< numbers.length; i++) //for rounds? = length-1
        {
            for(int j=0; j< numbers.length-1; j++)  // to swap 2 adjacent no
            {
                if(numbers[j] > numbers[j+1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println("count:"+count);
    }
 // OR
// Version 2:
    // dynamically swapped
    static void bubbleSort2(int[] numbers)
    {
        boolean swapped;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            swapped = false;
            for(int j = 0; j < numbers.length - 1 - i; j++)
            {
                if(numbers[j] > numbers[j + 1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {36,19,29,12,5};
        System.out.println(numbers[0]); //before sorting at index 0 is 36
       // bubbleSort1(numbers);
        bubbleSort2(numbers);
        System.out.println(numbers[0]); //after sorting at index 0 is 5

        // to print
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }
    }
}
