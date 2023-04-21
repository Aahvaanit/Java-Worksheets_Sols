public class problem2 {
    public static void main(String args[]) {
        double sum = 0;
        double n = 1;
        for (int i = 1; i <= 100; i++) {
            n /= i;
            sum += n * n;         
        }
        IBIO.output(sum);
    }
}
