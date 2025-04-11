package firstModuleSecondTask;

public class Boat extends Transport implements HasPropeller, CarriesCargo{

    Boat(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Boat-" + getModel() + " is going!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Boat-" + getModel() + " is carrying cargo.");
    }

    @Override
    public void movePropeller() {
        System.out.println("Boat-" + getModel() + " is moving propeller.");
    }
}
