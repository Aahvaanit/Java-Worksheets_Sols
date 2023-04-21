public class problem2 {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            int holder = 0;
            int n = i % 3;

            switch (n) {
                case 0:
                    holder = i * -5;
                    break;
                case 1:
                    holder = i * 7;
                    break;
                case 2:
                    holder = i * 2;
                    break;
            }

            sum += holder;
        }
        IBIO.output(sum);
    }
}
