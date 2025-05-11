package fifthModuleThirdTask;

public class GamingComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCPU("Intel i9");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("64GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("NVIDIA RTX 4090");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("1000W Gold PSU");
    }

    @Override
    public void buildCoolingSystem() {
        computer.setCoolingSystem("Water Cooling");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
