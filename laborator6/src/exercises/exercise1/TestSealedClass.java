package exercises;

public class TestSealedClass {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 3);
        Shape s3 = new Triangle();

        s1.describe();
        s2.describe();
        s3.describe();
    }
}
