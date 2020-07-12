package decorator;

    public class Main {
        public static void main(String[] args) {
            Beverage espresso = new Espresso();
            Beverage milkWithEspresso = new Milk(espresso);


            Double cost = milkWithEspresso.cost();

            System.out.println(cost);

            Double cost2 = new Milk(new Espresso()).cost();
            String description = new Milk(new Espresso()).getDescription();
            System.out.println(cost2 + " " + description);

            Double cost3 = new Sugar(new Milk(new Espresso())).cost();

            String description3  = new Sugar(new Milk(new Espresso())).getDescription();
            System.out.println(cost3 + " " + description3);
        }
}
