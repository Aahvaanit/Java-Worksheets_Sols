public class problem4 {
    public static void main(String args[]) {
        double sum = 0;
        int n = 1;
        double term = 1;
        for (int i = 1; i <= 100; i++) {
            sum += term * 2;  
            n += 2;
            term /= n;
            term *= i;            
        }
        IBIO.output(sum);
    }
}
