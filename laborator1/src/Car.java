public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private FuelType fuel;
    private static int carCount = 0;

    // Enum for fuel types
    public enum FuelType {
        PETROL, DIESEL, ELECTRIC, HYBRID;
    }
    // Constructor
    public Car(String brand, String model, int year, double price, FuelType fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.setPrice(price); // Use setter to ensure no negative prices
        this.fuel = fuel;
        carCount++; // Increment car count
    }
    // Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public FuelType getFuel() {
        return fuel;
    }
    // Setter with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price value! Price cannot be negative.");
        }
    }
    // Display car details
    public void displayCarInfo() {
        System.out.println(this);
    }
    // Compare car prices
    public boolean isMoreExpensiveThan(Car otherCar) {
        return this.price > otherCar.price;
    }
    // Apply discount method
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }
    // Get total number of cars created
    public static int getCarCount() {
        return carCount;
    }
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year && brand.equals(car.brand) && model.equals(car.model);
    }
    // Override toString method
    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + "', model='" + model + "', year=" + year + ", price=$" + price +
                ", fuel=" + fuel + '}';
    }
}