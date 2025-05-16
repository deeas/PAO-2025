package exercises.exercise1;

final class Circle extends Shape {
    double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public void describe() {
        System.out.println("Circle with radius: " + radius);
    }
}
