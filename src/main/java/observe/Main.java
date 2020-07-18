package observe;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        AuctionManager am = new AuctionManager();

        AuctionObserver user = new User();
        am.addObserver(user);

        AuctionObserver company = new Company();
        am.addObserver(company);

        am.changePrice(BigDecimal.TEN);

        am.removeObserver(company);

        am.changePrice(BigDecimal.valueOf(20.08));




    }
}
