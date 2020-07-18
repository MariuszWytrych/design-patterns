package templatemethod;

public class UserOne extends GoToWork{
    @Override
    void breakfast() {
        System.out.println("Eat sandwich");

    }

    @Override
    void transport() {
        System.out.println("Drive bus");

    }
}
