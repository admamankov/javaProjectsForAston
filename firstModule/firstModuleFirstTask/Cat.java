package firstModuleFirstTask;

public class Cat extends Mammal implements HasCoat {

    private int whiskers;

    Cat(String name, int age, double weight, int legsCount, int whiskers) {
        super(name, age, weight, legsCount);
        this.whiskers = whiskers;
    }

    public int getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(int whiskers) {
        this.whiskers = whiskers;
    }

    @Override
    public void hasCoatMessage() {
        System.out.println("Has a coat");
    }
}
