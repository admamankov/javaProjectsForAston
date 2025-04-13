package firstModuleSecondTask;

public class Tanker extends Transport implements CarriesCargo{

    private final Propeller propeller;

    Tanker(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
        this.propeller = new Propeller("S-67");
    }

    @Override
    public void move() {
        System.out.println("Tanker-" + getModel() + " is driving!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Tanker-" + getModel() + " is carrying cargo.");
    }
}
