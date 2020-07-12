package builderwithinterface;

public interface ComputerBuilder {
    Computer build();


    ComputerBuilder processorGhz (Double processorGhz);
    ComputerBuilder memoryRam (Integer memoryRam);
    ComputerBuilder monitorInch (Double monitorInch);
    ComputerBuilder yearsOld(Integer yearsOld);
    ComputerBuilder weight (Double weight);
    ComputerBuilder operationSystem (String operationSystem);






}
