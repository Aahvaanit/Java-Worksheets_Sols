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

    public void enter() throws Exception {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " ");
        Scanner parse = new Scanner(strFraction);
        this.num = parse.nextInt();
        this.den = parse.nextInt();

        /* Problem 4 */
        if (this.den <= 0)
            throw new Exception("!!!  Invalid denominator: Please enter a denominator greater than zero  !!!");
        /* End */

        this.simplify();
    }

    /* Problem1 */
    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        result.num = (this.num * f.den) + (f.num * this.den);
        result.den = this.den * f.den;
        result.simplify();
        return result;
    }
    /* End */

    /* Problem2 */
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
        int gcd = gcd(this.num, this.den);
        this.num /= gcd;
        this.den /= gcd;
    }
    /* End */

    /* Problem3 */
    public double toDecimal() {
        return (double) (this.num / this.den);
    }

    public void print() {
        IBIO.output(this.toString());
    }
    /* End */
}