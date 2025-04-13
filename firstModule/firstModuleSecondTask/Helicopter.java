package firstModuleSecondTask;

public class Helicopter extends Transport implements CarriesCargo{

    private final Propeller propeller;
    private final Wheels wheels;

    Helicopter(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
        this.propeller = new Propeller("TH-446");
        this.wheels = new Wheels("Roll-Hg");
    }

    @Override
    public void move() {
        System.out.println("Helicopter-" + getModel() + " is flying!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Helicopter-" + getModel() + " is carrying cargo.");
    }
}
