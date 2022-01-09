package Builderpattern;

public class Main {


    public static void main(String[] args) {
        Computer computer = new Computer.CombuterBuilder("1 TB" , "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.getHDD());
        System.out.println(computer.getRAM());

    }
}
