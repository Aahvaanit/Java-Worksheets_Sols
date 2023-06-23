public class problem2 {
    public static void main(String args[]) { 
        double xx = 1;
        for (int i = 0; i < 10; i++) { 
            xx *= 3.732;
            xx *= 100;
            xx = (int) xx;
            xx /= 100;

            String yy = "" + xx;
            int zz = yy.indexOf(".");
            String ww = "";

            do {
                ww += " ";
                zz--;
            } while (zz != 0);

            IBIO.output(ww + yy);
        }
    }
}

