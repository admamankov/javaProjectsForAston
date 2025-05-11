package fifthModuleThirdTask;

public interface ComputerBuilder {
    void buildCPU();

    void buildRAM();

    void buildStorage();

    void buildGPU();

    void buildPowerSupply();

    void buildCoolingSystem();

    Computer getComputer();
}
