public class problem2 {
    public static void main(String args[]) { 
        double xx = 1;
        for (int i = 0; i < 10; i++) { 
            xx *= 3.732;
            xx *= 100;
            xx = (int) xx;
            xx /= 100;

            String yy = "" + xx;
            String tab = "";

            int length = 6 - yy.indexOf(".");

            for (int j = 0; j < length; j++) {
                tab += " ";
            }

            IBIO.output(tab + yy);
        }
    }
}

