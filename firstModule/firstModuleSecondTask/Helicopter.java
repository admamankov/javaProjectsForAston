package firstModuleSecondTask;

public class Helicopter extends Transport implements HasWheels, HasPropeller, CarriesCargo{

    Helicopter(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Helicopter-" + getModel() + " is flying!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Helicopter-" + getModel() + " is carrying cargo.");
    }

    @Override
    public void movePropeller() {
        System.out.println("Helicopter-" + getModel() + " is moving propeller.");
    }

    @Override
    public void driveOnWheels() {
        System.out.println("Helicopter-" + getModel() + " is driving on the wheels.");
    }
}
