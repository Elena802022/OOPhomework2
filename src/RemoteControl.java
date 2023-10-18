public interface RemoteControl {
    void use();
    default void heatUp(){
        System.out.println("Thing is heating");
    }
}
