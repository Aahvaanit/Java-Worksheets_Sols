import java.util.Scanner;

public class Fraction {
    /* Starting */
    int num;
    int den;

    Fraction(int a, int b) {
        num = a;
        den = b;
    }

    Fraction() {
        num = 0;
        den = 1;
    }

    public String toString() {
        String s = num + "/" + den;
        return s;
    }

    public void enter() {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " ");
        Scanner parse = new Scanner(strFraction);
        this.num = parse.nextInt();
        this.den = parse.nextInt();
        // this.simplify;
    }

    /* problem1 */
    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        result.num = (this.num * f.den) + (f.num * this.den);
        result.den = this.den * f.den;

        return result;
    }

    /* problem2 */
    private static int gcd(int num, int den) {
        if (num <= 0) 
            return 1;

        while (num != den) {
            if (num> den)
                num -= den;
            else
                den -= num;
        }

        return num;
    }

    private void simplify() {
        
    }
}