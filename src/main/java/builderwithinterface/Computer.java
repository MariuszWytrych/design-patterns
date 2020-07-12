package builderwithinterface;

//DTO - Data Transfer Object

public class Computer {
    private Double processorGhz;
    private Integer memoryRam;
    private Double monitorInch;
    private Integer yearsOld;
    private Double weight;
    private String operationSystem;

    public Computer(Double processorGhz, Integer memoryRam) {
        this.processorGhz = processorGhz;
        this.memoryRam = memoryRam;
    }

    public double getProcessorGhz() {
        return processorGhz;
    }

    public void setProcessorGhz(Double processorGhz) {
        this.processorGhz = processorGhz;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(Integer memoryRam) {
        this.memoryRam = memoryRam;
    }

    public double getMonitorInch() {
        return monitorInch;
    }

    public void setMonitorInch(Double monitorInch) {
        this.monitorInch = monitorInch;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(Integer yearsOld) {
        this.yearsOld = yearsOld;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorGhz=" + processorGhz +
                ", memoryRam=" + memoryRam +
                ", monitorInch=" + monitorInch +
                ", age=" + yearsOld +
                ", weight=" + weight +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
