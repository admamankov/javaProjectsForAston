package fifthModuleThirdTask;

public class Director {
    private ComputerBuilder builder;

    public void setComputerBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer getComputer() {
        return builder.getComputer();
    }

    public void constructComputer() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildGPU();
        builder.buildPowerSupply();
        builder.buildCoolingSystem();
    }
}
