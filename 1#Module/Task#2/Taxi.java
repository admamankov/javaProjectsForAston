package firstModuleSecondTask;

public class Taxi extends Transport{

    private final Wheels wheels;

    Taxi(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
        this.wheels = new Wheels("Bs-Rl");
    }

    @Override
    public void move() {
        System.out.println("Taxi-" + getModel() + " is driving!");
    }
}
