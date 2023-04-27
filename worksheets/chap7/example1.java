public class example1 {
    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) { 
            String xx = pad(i, 10)+pad(i*i, 10)+pad(i*i*i, 10);
            IBIO.output(xx);
        }
    }

    static String pad(int n, int tab) { 
        String xx = "" + n;
        do {
             xx += " ";
        } while (xx.length() < tab);
        return xx;
    }
}
