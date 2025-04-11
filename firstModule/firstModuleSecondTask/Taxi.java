package firstModuleSecondTask;

public class Taxi extends Transport implements HasWheels{

    Taxi(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Taxi-" + getModel() + " is driving!");
    }

    @Override
    public void driveOnWheels() {
        System.out.println("Taxi-" + getModel() + " is driving on the wheels.");
    }
}
