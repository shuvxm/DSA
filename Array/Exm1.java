import java.util.Vector;

public class Exm1 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        System.out.println("vector size = " + vec.size());
        System.out.println(vec);

        // add
        vec.add(12);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);
        vec.add(8);
        vec.add(9);
        vec.add(10);
        // System.out.println(vec);

        System.out.println("vector size after adding = " + vec.size());
        for (Integer ele : vec) {
            System.out.println(ele);
        }

        // delete
        vec.remove(vec.size() - 1);
        System.out.println("after removing one value is " + vec);

        System.out.println(vec.capacity());
    }

}
