package firstModuleSecondTask;

class Wings{
    private String type;

     public Wings(String type){
        this.type = type;
    }
}

public class Plane extends Transport implements CarriesCargo {

    private final Wings wing;
    private final Propeller propeller;
    private final Wheels wheels;

    Plane(String model, int yearOfManufacture, String wing) {
        super(model, yearOfManufacture);
        this.wing = new Wings(wing);
        this.propeller = new Propeller("Tp-445");
        this.wheels = new Wheels("Roll-12");
    }

    @Override
    public void move() {
        System.out.println("Plane-" + getModel() + " is flying!");
    }

    @Override
    public void carryLoad() {
        System.out.println("Plane-" + getModel() + " is carrying cargo.");
    }
}
