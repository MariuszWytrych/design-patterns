package strategy;

public class Transfer implements Payment{


    @Override
    public String pay(Double toPay) {
        return "Zaloguj się na stronę banku i wykonaj przelew o wartości: " + toPay + " PLN";
    }
}
