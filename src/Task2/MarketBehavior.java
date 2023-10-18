package Task2;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Human humans);
    void releaseFromMarket(List<Human> humans);
    void update();
}
