public class FractionTest {
    public static void main (String[] args) {

        Fraction a = new Fraction();
        a.enter();
        Fraction b = new Fraction(); 
        b.enter(); 
        Fraction c = new Fraction(); 
        c = a.add(b);
        System.out.println(c);

        Fraction x = new Fraction();
        x.enter(); 
        x.print(); 
        double y = a.toDecimal();
        IBIO.output(x + " change to decimal = " + y);
    }
}
