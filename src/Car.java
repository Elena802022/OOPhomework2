public class Car implements Moving, RemoteControl {
    @Override
    public void move() {
        System.out.println("Car is riding");
    }

    @Override
    public void use() {
        System.out.println("Car is controlling");

    }

    @Override
    public void heatUp() {
        System.out.println("Car is heating");
    }
}
