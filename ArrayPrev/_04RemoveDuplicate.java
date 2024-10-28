package ArrayPrev;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
remove duplicate in place from sorted array
 */
public class _04RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,2};

//      removeDuplicate1(arr);
        System.out.println(removeDuplicate2(arr));
    }

    // brute force approach
    static void removeDuplicate1(int[] arr)
    {
        Set<Integer> st = new TreeSet<>();
        for(int i=0; i< arr.length; i++)
        {
            st.add(arr[i]);
        }
        // Using an iterator to traverse and print the sorted elements
        for (Integer integer : st) {
            System.out.print(integer + " ");
        }
//        Iterator<Integer> i = st.iterator();
//        while (i.hasNext()) {
//            System.out.print(i.next() + " ");
//        }

    }

    // optimal solution
   static int removeDuplicate2(int[] arr)
   {
       int i=0;
       for(int j=1; j<arr.length; j++)
       {
           if(arr[i] != arr[j])
           {
               arr[i+1] = arr[j];
               i++;
           }
       }
       return i+1;
   }
}
