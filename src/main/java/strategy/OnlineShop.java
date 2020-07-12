package strategy;

public class OnlineShop {
    private Payment payment;

    public OnlineShop(Payment payment) {
        this.payment = payment;
    }

    public String toPay (Double toPay){
        return payment.pay(toPay);
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
