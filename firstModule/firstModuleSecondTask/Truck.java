package firstModuleSecondTask;

public class Truck extends Transport implements CarriesCargo{

    private final Wheels wheels;

    Truck(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
        this.wheels = new Wheels("Hg-23");
    }

    @Override
    public void move() {
        System.out.println("Truck-" + getModel() + " is driving!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Truck-" + getModel() + " is carrying cargo.");
    }
}
