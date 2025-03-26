package entities;

public class ElectricCar extends Car {
    private int batteryPercentage;

    public ElectricCar(String brand, String model, int year, double price, FuelType fuel, int batteryPercentage) {
        super(brand, model, year, price, fuel);
        this.batteryPercentage = batteryPercentage;
    }


}
