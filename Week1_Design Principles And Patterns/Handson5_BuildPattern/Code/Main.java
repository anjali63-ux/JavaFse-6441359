public class Main {
    public static void main(String[] args) {
        // Create a computer onject using the builder
        Computer myPC = new Computer.Builder()
                            .setCpu("Intel i5")
                            .setRam(8)
                            .setStorage(512)
                            .build();

        myPC.run(); // to call the method run
    }
}
