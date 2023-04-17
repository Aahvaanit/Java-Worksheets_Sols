public class problem4 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            int n = i * i * i;
            if (n < 10) {
                IBIO.output("   " + n);
            }
            else {
                if (n >= 100) {
                    if (n >= 1000) {
                        IBIO.output("" + n);
                    }
                    else {
                        IBIO.output(" " + n);
                    }
                }
                else {
                    IBIO.output("  " + n);
                }
            }
        }
    }    
}
