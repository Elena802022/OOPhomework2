package Task2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehavior{
    List<Human> humans = new ArrayList<>();
    Queue<Actor> actors = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Human humans) {
        System.out.println(humans.getName() + " пришел в магазин");
    }

    @Override
    public void releaseFromMarket(List<Human> humans) {

    }

    @Override
    public void releaseFromMarket(Human humans) {
        System.out.println(humans.getName() + " ушел из магазина");

    }

    @Override
    public void update() {

    }

    @Override
    public void takeQueue(Human humans) {
        this.actors.add(humans);
        System.out.println(((Human) humans).getName() + " встал в очередь");
    }

    @Override
    public void takeInQueue(Human human) {

    }

    @Override
    public void takeOrders() {
        assert this.actors.peek() != null;
        System.out.println(this.actors.peek().getName() + " сделал заказ");
        assert this.actors.peek() != null;
        this.actors.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        assert this.actors.peek() != null;
        System.out.println(this.actors.peek().getName() + " получил заказ");
        assert this.actors.peek() != null;
        this.actors.peek().setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void releaseFromQueue(Human humans) {
        this.actors.remove(humans);
        System.out.println(humans.getName() + " ушел домой");
    }

}

