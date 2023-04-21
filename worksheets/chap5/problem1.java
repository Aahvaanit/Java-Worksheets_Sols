public class problem1 {
    public static void main(String args[]) {
        double sum = 0;
        double n = 1;
        for (int i = 0; i < 100; i++) {
            n /= 5;
            sum += n;
        }
        IBIO.output(sum);
    }
}
