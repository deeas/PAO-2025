package entities;

public class LuxuryCar extends Car {
    private boolean hasAutopilot;

    public LuxuryCar(String brand, String model, int year, double price, FuelType fuel, boolean hasAutopilot) {
        super(brand, model, year, price, fuel);
        this.hasAutopilot = hasAutopilot;
    }

    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("Autopilot: " + (hasAutopilot ? "Yes" : "No"));
    }
}
