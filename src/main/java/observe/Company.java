package observe;

import java.math.BigDecimal;

public class Company implements AuctionObserver {

    @Override
    public void inform(BigDecimal newPrice) {
        System.out.println("Company new price : " + newPrice.multiply(BigDecimal.valueOf(0.76)));

    }
}
