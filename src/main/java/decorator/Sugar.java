package decorator;

public class Sugar extends CondimentDecorator {
    private Beverage decorated;

    public Sugar (Beverage beverage){

        decorated = beverage;
    }

    @Override
    public String getDescription() {

        return decorated.getDescription() + " with " + "Sugar";
    }

    @Override
    public Double cost(){

    return 1.2 + decorated.cost();
    }
}
