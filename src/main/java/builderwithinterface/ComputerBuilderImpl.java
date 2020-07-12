package builderwithinterface;



public class ComputerBuilderImpl implements ComputerBuilder {

    private Computer computer;

    public ComputerBuilderImpl(Double processorGhz, Integer memoryRam) {
        computer = new Computer(processorGhz,memoryRam);
    }

    public Computer build() {
        return computer;
    }

    public ComputerBuilder processorGhz(Double processorGhz) {
        computer.setProcessorGhz(processorGhz);
        return this;
    }

    public ComputerBuilder memoryRam(Integer memoryRam) {
        computer.setMemoryRam(memoryRam);
        return this;
    }

    public ComputerBuilder monitorInch(Double monitorInch) {
        computer.setMonitorInch(monitorInch);
        return this;
    }

    public ComputerBuilder yearsOld(Integer yearsOld) {
        computer.setYearsOld(yearsOld);
        return this;
    }

    public ComputerBuilder weight(Double weight) {
        computer.setWeight(weight);
        return this;
    }

    public ComputerBuilder operationSystem(String operationSystem) {
        computer.setOperationSystem(operationSystem);
        return this;
    }
}
