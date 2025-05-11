package fifthModuleThirdTask;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String powerSupply;
    private String coolingSystem;

    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }
    public String getPowerSupply() { return powerSupply; }
    public String getCoolingSystem() { return coolingSystem; }

    public void setCPU(String CPU) { this.CPU = CPU; }
    public void setRAM(String RAM) { this.RAM = RAM; }
    public void setStorage(String storage) { this.storage = storage; }
    public void setGPU(String GPU) { this.GPU = GPU; }
    public void setPowerSupply(String powerSupply) { this.powerSupply = powerSupply; }
    public void setCoolingSystem(String coolingSystem) { this.coolingSystem = coolingSystem; }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                '}';
    }
}
