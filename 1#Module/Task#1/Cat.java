package firstModuleFirstTask;

public class Cat extends Mammal {

    private int whiskers;
    private Coat coat;

    Cat(String name, int age, double weight, int legsCount, int whiskers, Coat coat, Spine spine) {
        super(name, age, weight, legsCount, spine);
        this.whiskers = whiskers;
        this.coat = coat;
    }


}

