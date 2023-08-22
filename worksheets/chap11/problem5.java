public class problem5 {
    public static void main(String[] args) {
        try {
            enter();
            IBIO.output("Thank you!");
        } catch (Exception e) {
            IBIO.output(e.getMessage());
        }
    }

    public static void enter() throws Exception {
        String number = IBIO.input("Enter number: ");
        char[] digits = number.toCharArray();
        int length = number.length();

        if (length != 4)
            throw new Exception("Number must be contain ONLY FOUR digits");
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (digits[i] == digits[j]) 
                    throw new Exception("Number must have ALL DIFFERENT digits");
            }
        }
    }
}
