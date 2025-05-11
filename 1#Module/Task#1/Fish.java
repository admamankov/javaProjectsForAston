package firstModuleFirstTask;

public class Fish extends Animal implements CanBreatheUnderwater {

    private int finsCount;

    Fish(String name, int age, double weight, int finsCount){
        super(name, age, weight);
        this.finsCount = finsCount;
    }

    @Override
    public void breathingUnderwaterMessage() {
        System.out.println("Breathing under water.");
    }
}
