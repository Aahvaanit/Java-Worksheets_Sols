public class problem2 {
    public static void main(String args[]) {
        int n = IBIO.inputInt("Enter number: ");
        if (n % 2 == 0) {
            IBIO.output("EVEN");
        }
        if (n % 2 == 1) {
            IBIO.output("ODD");
        }
    }
}
