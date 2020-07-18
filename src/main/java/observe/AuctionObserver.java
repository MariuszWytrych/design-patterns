package observe;

import java.math.BigDecimal;

public interface AuctionObserver {
    void inform(BigDecimal newPrice);
}
