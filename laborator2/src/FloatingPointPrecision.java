/***Exercise 1: Floating-Point Precision Comparison**
Write a program that compares the precision of `float` and `double` by performing arithmetic
operations and observing the differences in precision.
*/
public class FloatingPointPrecision {
    public static void main(String[] args) {
        float floatNumber = 1.0f / 3;
        double doubleNumber = 1.0 / 3;

        System.out.println("Float precision: " + floatNumber);
        System.out.println("Double precision: " + doubleNumber);
    }
}