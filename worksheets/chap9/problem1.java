public class problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) { 
            double xx = Math.random() * 6;
            int yy = (int)(xx + 1); 
            sum += yy;
            IBIO.output(yy);
        }

        IBIO.output("\n" + (int) sum/100);
    }
}
