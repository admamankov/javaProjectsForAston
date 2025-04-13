package firstModuleFirstTask;

public class Whale extends Mammal implements CanBreatheUnderwater {

    Whale(String name, int age, double weight, int legsCount, Spine spine) {
        super(name, age, weight, legsCount, spine);
    }

    @Override
    public void breathingUnderwaterMessage() {
        System.out.println("Breathing under water.");
    }
}
