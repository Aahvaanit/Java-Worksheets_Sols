public class problem1 {
    public static void main(String args[]) { 
        double xx = 1;
        for (int i = 0; i < 10; i++) { 
            xx *= 3.732;
            xx *= 100;
            xx = (int) xx;
            xx /= 100;
            IBIO.output(xx);
        }
    }
}
