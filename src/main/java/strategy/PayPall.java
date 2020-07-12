package strategy;

public class PayPall implements Payment{


    @Override
    public String pay(Double toPay) {
        return "Zaloguj się do systemu PayPal i potwierdź obciążenie kwotą : " + toPay + " PLN";
    }
}
