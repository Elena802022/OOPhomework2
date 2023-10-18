package Task2;

public class Human extends Actor implements ActorBehavior{
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Заказ выполнен");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Заказ выдан");

    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
