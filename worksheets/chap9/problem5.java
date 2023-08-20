public class problem5 {
    public final static int SIZE = 1000;
    public static void main(String[] args) {
        int[] num = new int[SIZE];

        for (int i = 0; i < SIZE; i++)
            num[i] = random(6) + random(6);

        for (int i = 2; i < 13; i++) {
            IBIO.out(pad(i));
            for (int j = 0; j < SIZE; j++) {
                if (num[j] == i) {
                    IBIO.out("X");
                }
            }
            IBIO.output("");
        }
    }

    static int random(int n) {
        double x = Math.random() * n;
        return (int)(x + 1);
    }

    static String pad(int n) {
        String s = "" + n + " ";
        int a = 5 - s.indexOf(" ");
        for (int i = 0; i < a; i++) {
            s += " ";
        }

        return s;
    }
}