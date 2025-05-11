package fifthModuleThirdTask;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Integrated Intel UHD");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("500W Bronze PSU");
    }

    @Override
    public void buildCoolingSystem() {
        computer.setCoolingSystem("Standard Fan");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
