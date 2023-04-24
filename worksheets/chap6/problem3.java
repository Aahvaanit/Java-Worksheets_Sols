public class problem3 {
    public static void main(String args[]) {
        int num = IBIO.inputInt("Enter number of lines: ");
        String aa = stars(num);

        for (int i = 1; i < num*2; i++) {
            IBIO.output(blank(Math.abs(num-i)) + aa);
        }
    }

    static String stars(int n) {
        String xx = "";
        for (int i = 0; i < n; i++)
        xx += "* ";
        return xx;
    }

    static String blank(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += " ";
        }
        return s;
    }
}
