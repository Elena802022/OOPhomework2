package Task2;

public interface QueueBehavior {
    void releaseFromMarket(Human humans);

    void takeQueue(Human humans);

    void takeInQueue(Human human);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

    void releaseFromQueue(Human humans);
}
