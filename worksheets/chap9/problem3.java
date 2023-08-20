public class problem3 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++)
            num[i] = random();

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 100; j++) {
                if (num[j] == i) {
                    IBIO.out(num[j]);
                }
            }
            IBIO.output("");
        }
    }

    static int random() {
        double x = Math.random() * 6;
        return (int)(x + 1);
    }
}
