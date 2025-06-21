public class Computer {
    // assume computer attributes 
    private String cpu ;
    private int ram;
    private int storage;

    // Private constructor  to computer
    private Computer(Builder builder) {
        this.cpu = builder.cpu;// "this" is used to refer the current object 
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    // Static Builder class
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // Print details of computer
    public void run() {
        System.out.println("** Computer Configurations **");
        System.out.println("CPU: " + cpu); // O/P: CPU: Intel i5
        System.out.println("RAM: " + ram + " GB");// O/P: RAM: 8 GB
        System.out.println("STORAGE: " + storage + " GB"); // O/P: STORAGE: 512 GB
    }
}
