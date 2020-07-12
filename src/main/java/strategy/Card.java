package strategy;

public class Card implements Payment{



    @Override
    public String pay(Double toPay) {
        return "Pobrano z karty: " + toPay + " PLN";
    }
}
