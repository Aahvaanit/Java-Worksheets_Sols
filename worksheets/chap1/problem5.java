public class problem5 {
    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            
            int n = 2;
            for (int j = 0; j < i; j++) {
                n *= 2;
            }

            IBIO.output(n);
            IBIO.output(i + 1);
        }
    }
}
