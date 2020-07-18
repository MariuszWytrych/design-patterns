package observe;

import java.math.BigDecimal;

public class User implements AuctionObserver {

    @Override
    public void inform(BigDecimal newPrice) {
        System.out.println("User new price : " + newPrice);
    }
}
