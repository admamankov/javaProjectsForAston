package firstModuleSecondTask;

public class Tanker extends Transport implements HasPropeller, CarriesCargo{

    Tanker(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void move() {
        System.out.println("Tanker-" + getModel() + " is driving!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Tanker-" + getModel() + " is carrying cargo.");
    }

    @Override
    public void movePropeller() {
        System.out.println("Tanker-" + getModel() + " is moving propeller.");
    }
}
