public class problem3 {
    public static void main(String args[]) {
        double sum = 0;
        int term = 1;
        int sign = 1;
        for (int i = 1; i <= 10000; i++) {
            double term2 = 1;
            term2 /= term;
            term += 2;
            sum += sign * term2 * 4;
            sign *= -1;
        }
        IBIO.output(sum);
    }
}
