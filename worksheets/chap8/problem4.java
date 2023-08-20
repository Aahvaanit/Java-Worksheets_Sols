public class problem4 {
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
