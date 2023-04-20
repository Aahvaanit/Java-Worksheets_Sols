public class problem1 {
    public static void main(String args[]) {
        int a = IBIO.inputInt("Enter first number: ");
        int b = IBIO.inputInt("Enter second number: ");

        IBIO.output("Press:  [1] for addition");
        IBIO.output("        [2] for multiplication");
        IBIO.output("        [3] for quit");

        int n;
        do {
            n = IBIO.inputInt("> ");
        } while (n > 3 || n < 0);

        switch (n) {
            case 1:
                IBIO.output(a + b);
                break;
            case 2:
                IBIO.output(a * b);
                break;
            case 3:
                IBIO.output("Exited program.");
                break;
            default:
                IBIO.output("Invalid input.");
                break;
        }
    }
}