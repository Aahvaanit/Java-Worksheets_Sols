public class problem1 {
    public static void main(String args[]) {
        int n;
        do {
            n = IBIO.inputInt("Enter a number below 100: ");
        } while (n >= 100 || n % 2 == 1 || n <= 0);
        IBIO.output(n);
    }
}
