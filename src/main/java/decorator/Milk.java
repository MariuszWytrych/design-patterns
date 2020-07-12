package decorator;

public class Milk extends CondimentDecorator {
    private Beverage decorated;

    public Milk (Beverage beverage){
        decorated = beverage;
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + " Milk with " + " ";
    }

    @Override
    public Double cost() {
        Double costOfDecorated = decorated.cost();
        return 0.5 + costOfDecorated;
    }


}
