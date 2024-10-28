package ArrayPrev;

public class LinearSearch2 {
    static String search(String fruits[], String key){
        for(int i=0; i < fruits.length; i++){
            if(fruits[i] == key)
                return "found at: "+i;
        }
        return "not found";
    }
    public static void main(String[] args) {
        String fruits[] = {"orange","apple","mango","papaya"};
        String key = "mango";
        System.out.println(search(fruits,key));
    }
}
