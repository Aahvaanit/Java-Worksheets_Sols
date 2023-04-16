public class problem6 {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int n = IBIO.inputInt("Enter number of terms: ");

        IBIO.output(a);
        
        for (int i = 0; i < n; i++) {
            IBIO.output(b);
            b = b + a;
            a = b - a;
        }
    }
}
