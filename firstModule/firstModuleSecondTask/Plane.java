package firstModuleSecondTask;

public class Plane extends Transport implements HasWheels, HasPropeller, HasWings, CarriesCargo {

    Plane(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Plane-" + getModel() + " is flying!");
    }

    @Override
    public void driveOnWheels() {
        System.out.println("Plane-" + getModel() + " is using wheels to takes off.");
    }

    @Override
    public void carryLoad() {
        System.out.println("Plane-" + getModel() + " is carrying cargo.");
    }

    @Override
    public void movePropeller() {
        System.out.println("Plane-" + getModel() + " is moving propeller.");

    }

    @Override
    public void flyWithWings() {
        System.out.println("Plane-" + getModel() + " is flying with wings.");

    }
}
