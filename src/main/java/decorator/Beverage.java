package decorator;

public abstract class Beverage {
    public String description = "Base Beverage";

    public abstract Double cost ();

    public String getDescription() {
        return description;
    }
}
