package exercises.exercise1;

final public class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("Rectangle with radius: " + width + " " + height);
    }
}
