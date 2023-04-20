public class problem4 {
    public static void main(String args[]) {
        int n = IBIO.inputInt("Enter number: ");
        int steps = 0;

        do {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n *= 3;
                n++;
            }
            steps++;
        } while (n != 1);

        IBIO.output(steps);
    }
}
