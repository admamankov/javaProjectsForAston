package firstModuleFirstTask;

public class Bear extends Mammal {

    private Coat coat;

    Bear(String name, int age, double weight, int legsCount, Coat coat, Spine spine) {
        super(name, age, weight, legsCount, spine);
        this.coat = coat;
    }
}
