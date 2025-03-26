import entities.Car;
import entities.CarFactory;
import entities.FuelType;

public class CarTest {
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Toyota", "Camry", 2021, 25000, FuelType.PETROL);
        Car car2 = new Car("Honda", "Civic", 2022, 23000, FuelType.HYBRID);
        Car car3 = new Car("Tesla", "Model 3", 2023, 45000, FuelType.ELECTRIC);
        // Display car info
        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();
        // Comparing prices
        System.out.println("Is car1 more expensive than car2? " + car1.isMoreExpensiveThan(car2));
        // Applying discount
        car3.applyDiscount(10);
        System.out.println("After discount, Tesla Model 3 price: $" + car3.getPrice());
        // Checking total number of cars
        System.out.println("Total cars created: " + Car.getCarCount());
        // Testing equals method
        Car car4 = new Car("Toyota", "Camry", 2021, 25500, FuelType.PETROL);
        System.out.println("car1 equals car4? " + car1.equals(car4));


        ///////////

        Car myCar = CarFactory.createCar("electric", "Tesla", "Modelul S", 2023, 80000, FuelType.ELECTRIC);

        myCar.displayCarInfo();
    }
}