package firstModuleFirstTask;

public class Bear extends Mammal implements HasCoat {

    String coatColor;

    Bear(String name, int age, double weight, int legsCount, String coatColor) {
        super(name, age, weight, legsCount);
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public void hasCoatMessage() {
        System.out.println("Has a coat");
    }
}
