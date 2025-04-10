package exercises;

/*
Exercise 1: Define and Use a Sealed Class Hierarchy
Create a sealed class `Shape` with permitted subclasses `Circle`, `Rectangle`, and `Triangle`. Implement a method to describe each shape.
*/

public sealed class Shape permits Circle, Rectangle, Triangle {
    public void describe() {
        System.out.println("I am a shape");
    }
}
