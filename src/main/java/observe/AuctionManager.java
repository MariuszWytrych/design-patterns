package observe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AuctionManager {
    private BigDecimal price;

    List <AuctionObserver> observerList = new ArrayList<>();


    public void addObserver (AuctionObserver observer){
        observerList.add(observer);
    }
    public void changePrice (BigDecimal newPrice){
        this.price = newPrice;
        observerList.forEach(observer -> observer.inform((price)));
    }

    public void removeObserver (AuctionObserver observer){
        observerList.remove(observer);
    }
}
