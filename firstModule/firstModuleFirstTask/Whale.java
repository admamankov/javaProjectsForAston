package firstModuleFirstTask;

public class Whale extends Mammal implements CanBreatheUnderwater {

    Whale(String name, int age, double weight, int legsCount) {
        super(name, age, weight, legsCount);
    }

    @Override
    public void breathingUnderwaterMessage() {
        System.out.println("Breathing under water.");
    }
}
