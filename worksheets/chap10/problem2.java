public class problem2 {
    public static void main(String[] args) {
        String binary = IBIO.input("Enter your number: ");
        char[] digits = binary.toCharArray();

        int len = binary.length();
        int decimal= 0;

        for (int i = 0; i < len; i++) {
            int index = len - 1 - i;

            if (digits[index] == '0') {
                continue;
            }
            else if (digits[index] == '1') {
                decimal += Math.pow(2, i);
            }
            else {
                IBIO.output("This is an invalid binary number");
                System.exit(-1);
            }
        }
        IBIO.output(decimal);
    }
}
