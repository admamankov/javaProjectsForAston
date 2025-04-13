package firstModuleSecondTask;

public class Boat extends Transport implements CarriesCargo{

    private final Propeller propeller;

    Boat(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
        this.propeller = new Propeller("F-145");
    }

    @Override
    public void move() {
        System.out.println("Boat-" + getModel() + " is going!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Boat-" + getModel() + " is carrying cargo.");
    }


}
