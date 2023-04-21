public class problem3 {
    public static void main(String args[]) {
        int n;
        do {
            n = IBIO.inputInt("Enter number below 1000: ");
        } while (n > 1000);

        mainLoop:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * i + j * j == n) {
                    IBIO.output(i + " " + j);
                    break mainLoop;
                }
                if (i == n) {
                    IBIO.output("Impossible.");
                    break mainLoop;
                }
            }
        }
    }
}
