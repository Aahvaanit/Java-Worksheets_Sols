public class problem5 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < 100; k++) {
                    if (check(i, j, k) && gcd(gcd(i, j), k) == 1) {
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

    static int gcd(int a, int b) {
        int tmp1 = a;
        int tmp2 = b;

        while (tmp1 != tmp2) {
            if (tmp1 > tmp2) {
                tmp1 -= tmp2;
            }
            else {
                tmp2 -= tmp1;
            }
        }

        return tmp1;
    }
}
