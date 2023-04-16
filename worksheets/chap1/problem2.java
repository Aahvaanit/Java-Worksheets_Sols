public class problem2 {
    public static void main(String args[]) {
        int steps = IBIO.inputInt("Number of steps: ");
        int start = IBIO.inputInt("Starting number: ");
        int inc = IBIO.inputInt("Increment: ");

        for (int i = 0; i < steps; i ++) {
            IBIO.output(start);
            start += inc;
        }
    }
}
