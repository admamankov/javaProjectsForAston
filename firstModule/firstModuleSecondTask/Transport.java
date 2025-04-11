package firstModuleSecondTask;

public abstract class Transport {
    private String model;
    private double maxSpeed;
    private int yearOfManufacture;

    Transport(String model, double maxSpeed, int yearOfManufacture){
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void move();

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
