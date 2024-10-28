// package MockProgram;

public class StringInBoard {
    public static void main(String[] args) {
        char[][] a = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String s = "AABCCE";
        System.out.println(isContains(a, s));
    }

    static boolean isContains(char[][] a, String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = false;

            for (int j = 0; j < a.length; j++) {
                char[] b = a[j];
                flag = false;
                for (int k = 0; k < b.length; k++) {
                    if (b[k] == c) {
                        b[k] = '*';
                        flag = true;
                        break;
                    }

                }
                if (flag == true)
                    break;
            }
            if (flag == false)
                return false;
        }

        return true;
    }

}
