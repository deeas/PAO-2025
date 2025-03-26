package entities;

public class CarFactory {

    public  static Car createCar(String type, String brand,
                                 String model, int year, double price, FuelType fuelType) {
        switch (type.toLowerCase()) {
            case "luxury":
                return new LuxuryCar(brand, model, year, price, fuelType, true);
            case "electric":
                return  new ElectricCar(brand, model, year, price, fuelType, 80);
            default:
                return  new Car(brand, model, year, price, fuelType);
        }

    }
}
