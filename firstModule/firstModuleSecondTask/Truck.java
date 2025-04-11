package firstModuleSecondTask;

public class Truck extends Transport implements HasWheels, CarriesCargo{

    Truck(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Truck-" + getModel() + " is driving!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Truck-" + getModel() + " is carrying cargo.");
    }

    @Override
    public void driveOnWheels() {
        System.out.println("Truck-" + getModel() + " is driving on the wheels.");
    }
}
