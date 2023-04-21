public class problem1 {
    public static void main(String args[]) {
        int a = IBIO.inputInt("Enter first number: ");
        int b = IBIO.inputInt("Enter second number: ");

        int n;
        do {
            IBIO.output("Press:  [1] for addition");
            IBIO.output("        [2] for multiplication");
            IBIO.output("        [3] for quit");
            do {
                n = IBIO.inputInt("> ");
            } while (n < 0 || n > 3);

            switch (n) {
                case 1:
                    IBIO.output(a + b);
                    break;
                case 2:
                    IBIO.output(a * b);
                    break;
            }
        } while (n != 3);
    }
}