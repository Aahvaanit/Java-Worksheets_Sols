public class problem3 {
    public static void main(String args[]) {
        int sum = 0;
        int n = IBIO.inputInt("Enter Number: ");

        do {
            int digit = n % 10;
            sum += digit*digit*digit;
            n /= 10;
        } while (n != 0);

        IBIO.output(sum);
    }
}
