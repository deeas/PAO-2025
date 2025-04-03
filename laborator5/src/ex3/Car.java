package ex3;

public class Car implements Vehicle, Movable {
    @Override
    public void ride() {
        System.out.println("Car is riding");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.ride();
        car.move();
    }

}
