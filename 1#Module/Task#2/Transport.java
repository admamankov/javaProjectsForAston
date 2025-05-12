package firstModuleSecondTask;

public abstract class Transport {
    private String model;
    private int yearOfManufacture;

    Transport(String model, int yearOfManufacture){
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void move();

    public String getModel() {
        return model;
    }
}

class Propeller{
    private String type;

    Propeller(String type){
        this.type = type;
    }
}

class Wheels{
    private String type;

    Wheels(String type){
        this.type = type;
    }
}
