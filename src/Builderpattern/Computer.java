package Builderpattern;

public class Computer {


    //해당 객체를 빌더클래스를 이용해 만드는 예제

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(CombuterBuilder builder) {
        this.HDD = builder.Hdd;
        this.RAM = builder.Ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }



    //builder Class
    public static class CombuterBuilder{
        private String Hdd;
        private String Ram;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;


        public CombuterBuilder(String hdd, String ram) {
            Hdd = hdd;
            Ram = ram;
        }

        public CombuterBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public CombuterBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
