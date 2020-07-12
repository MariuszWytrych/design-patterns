package strategy;

public class Main {
    public static void main(String[] args) {
        Payment card = new Card();
        Payment transfer = new Transfer();
        Payment payPal = new PayPall ();


        OnlineShop onlineShop = new OnlineShop(card);
        onlineShop.setPayment(payPal);

        System.out.println(onlineShop.toPay(15.00));



    }
}
