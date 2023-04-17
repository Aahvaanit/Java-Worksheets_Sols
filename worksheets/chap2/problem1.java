public class problem1 {
    public static void main(String args[]) {
        int n = IBIO.inputInt("Enter a number between 50 and 60: ");
        if (n > 60) {
            IBIO.output("That number was too big.");
        }
        if (n < 50) {
            IBIO.output("That number was too small.");
        }
    }
}
