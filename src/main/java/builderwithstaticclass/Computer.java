package builderwithstaticclass;

public class Computer {
    private Double processorGhz;
    private int memoryRam;
    private Double monitorInch;
    private int age;
    private Double weight;
    private String operationSystem;

    private Computer(Builder builder){
        this.processorGhz = builder.processorGhz;
        this.memoryRam = builder.memoryRam;
        this.monitorInch = builder.monitorInch;
        this.age = builder.age;
        this.weight = builder.weight;
        this.operationSystem = builder.operationSystem;
    }

    public Double getProcessorGhz() {
        return processorGhz;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public Double getMonitorInch() {
        return monitorInch;
    }

    public int getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorGhz=" + processorGhz +
                ", memoryRam=" + memoryRam +
                ", monitorInch=" + monitorInch +
                ", age=" + age +
                ", weight=" + weight +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }

    public static class Builder{
    private Double processorGhz;
    private int memoryRam;
    private Double monitorInch;
    private int age;
    private Double weight;
    private String operationSystem;

    public Builder(){
    }


    public Builder processorGhz(Double processorGhz) {
        this.processorGhz = processorGhz;
        return this;
    }

    public Builder memoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
        return this;
    }

    public Builder monitorInch(Double monitorInch) {
        this.monitorInch = monitorInch;
        return this;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder weight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Builder operationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public Computer build (){
        return new Computer(this);
    }
}


}
