/**
**Exercise 1: Working with Primitive Data Types**
Create a Java program that declares and initializes variables of the following types:
        - `byte`, `short`, `int`, `long`
        - `float`, `double`
        - `char`, `boolean`
Print their values and experiment with

**Exercise 2: Type Conversion and  Casting**
 Write a Java program that:
 - Converts an `int` to `double`
 - Converts a `double` to `int` (using casting)
 - Converts a `char` to `int` (ASCII value)

 */

public class PrimitivesTypes {
    public static void main(String[] args) {
        byte smallNumber = 127;
        short shortNumber = 200;
        int integerNumber = 1000;
        long longNumber = 1000000;

        float floatNumber = 5.75f;
        double doubleNumber = 19.99;

        char  letter = 'A';
        boolean isJavaFun = true;

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + integerNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + letter);

        System.out.println("boolean: " + isJavaFun);

        System.out.println("Double to int: " + (int) doubleNumber);

        double newDouble = integerNumber;
        System.out.println("Int to double: " + newDouble);

    }

}
