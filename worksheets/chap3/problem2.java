public class problem2 {
    public static void main(String args[]) {
        int n;
        do {
            n = IBIO.inputInt("Enter a number bigger than 0: ");
        } while (n < 0);

        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count = i;
                break;
            }
        }

        if (count == 0) {
            IBIO.output("prime");
        }
        else {
            IBIO.output(count);
        }
    }
}
