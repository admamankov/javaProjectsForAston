package firstModuleFirstTask;

public class Mammal extends Animal{

    private int legsCount;
    private final Spine spine;

    Mammal(String name, int age, double weight, int legsCount, Spine spine) {
        super(name, age, weight);
        this.legsCount = legsCount;
        this.spine = spine;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}

class Spine{
    private int count;
    private double length;

    Spine(int count, double length){
        this.count = count;
        this.length = length;
    }
}

