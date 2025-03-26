public class Complex {
    private int realPart;
    private int imaginaryPart;

    public Complex(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex() {
        this(0, 0);
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void addWithComplex(Complex complex) {
        this.realPart += complex.realPart;
        this.imaginaryPart += complex.imaginaryPart;
    }

    public  void showNumber() {
        System.out.println("Real part: " + this.realPart + " Imaginary part: " + this.imaginaryPart);
    }

    public static Complex sumOfComplex(Complex complex1, Complex complex2) {
        return new Complex(complex1.realPart + complex2.realPart, complex1.imaginaryPart + complex2.imaginaryPart);
    }
}
