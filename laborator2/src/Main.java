//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);

        Complex c2 = new Complex(3, 4);

        c1.addWithComplex(c2);

        Complex c3 = Complex.sumOfComplex(c1, c2);

        System.out.println("C3: ");
        c3.showNumber();

        ///////////
        ChocolateBox chocolateBox = new ChocolateBox("Cherry", "Romania");

        System.out.println(chocolateBox.getVolume());
        chocolateBox.toString();

        Milka milka = new Milka("Vanilla", "Germany", 3.4f, 10f, 1.4f);
        System.out.println("Milka volume: " + milka.getVolume());
        System.out.println(milka);
    }
}