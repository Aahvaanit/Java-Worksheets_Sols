public class problem1 {
    public static void main(String[] args) {
        String s = IBIO.input("Enter a word: ");
        char[] x = s.toCharArray();

        int len = s.length();

        for (int i = 0; i < len; i++) {
            IBIO.out(x[i]);
        }
        IBIO.output("");

        for (int i = len - 1; i >= 0; i--) {
            IBIO.out(x[i]);
        }
        IBIO.output("");

        for (int i = 0; i < len; i++) {
            IBIO.out(x[i]);
        }

        for (int i = len - 2; i >= 0; i--) {
            IBIO.out(x[i]);
        }        
    }
}
