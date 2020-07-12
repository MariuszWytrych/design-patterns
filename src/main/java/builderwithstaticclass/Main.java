package builderwithstaticclass;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .processorGhz(2.2)
                .monitorInch(17.0)
                .operationSystem("Win 10")
                .weight(3.0)
                .memoryRam(8)
                .age(1)
                .build();

    }
}
