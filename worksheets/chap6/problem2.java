public class problem2 {
    public static void main(String args[]) { 
        int num = IBIO.inputInt("Enter number of lines: ");
            
        for (int i = 0; i < num; i++) {
            String aa = stars(i + 1);
            IBIO.output(aa);
        }
        for (int i = num - 1; i > 0; i--) {
            String aa = stars(i);
            IBIO.output(aa);
        }    
    }
    
    static String stars(int n) {
        String xx = "";
        for (int i = 0; i < n; i++)
        xx = xx + "*";
        return xx;
    }
}
