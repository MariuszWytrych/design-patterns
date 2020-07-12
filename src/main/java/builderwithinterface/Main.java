package builderwithinterface;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilderImpl(2.2,8)
                .memoryRam(8)
                .weight(5.0)
                .yearsOld(1)
                .operationSystem("Win 10")
                .build();

        System.out.println(computer);
    }

}
