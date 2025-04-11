package firstModuleFirstTask;

public class Mammal extends Animal implements HasSpine {

    private int legsCount;

    Mammal(String name, int age, double weight, int legsCount) {
        super(name, age, weight);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    @Override
    public void hasSpineMessage() {
        System.out.println("Has spine.");
    }
}
