// package Searching.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Shubham";
        char target = 'k';
        // System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0)
            return false;

        // Convert target to lowercase
        char lowerTarget = Character.toLowerCase(target);

        // to use for-each loop we need collections or array to iterate.
        for (char ch : str.toCharArray()) { // here converting string to char array
            if (lowerTarget == Character.toLowerCase(ch))
                return true;
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }
        return false;
    }
}
