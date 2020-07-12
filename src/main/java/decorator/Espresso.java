package decorator;

public class Espresso extends Beverage {



    public Espresso() {
        description = "Espresso";
    }


    @Override
    public Double cost() {
        return 5.5;
    }
}
