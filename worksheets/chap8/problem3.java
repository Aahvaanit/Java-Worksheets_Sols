public class problem3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    if (check(i, j, k)) {
                        IBIO.output(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    static boolean check(int a, int b, int c) {
        int x = a*a + b*b;
        int y = c*c;

        return (x == y);
    }
}
