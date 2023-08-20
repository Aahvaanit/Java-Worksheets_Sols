public class problem2 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++) {
            num[i] = random();
        }

        for (int i = 0; i < 100; i++) {
            IBIO.output(num[i]);
        }
    }

    static int random() {
        double x = Math.random() * 6;

        return (int)(x + 1);
    }
}
