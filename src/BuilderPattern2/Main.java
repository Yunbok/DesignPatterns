package BuilderPattern2;

public class Main {

    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();

        factory.setBlueprint(new LgGramBlueprint());
        factory.make();
        Computer computer2= factory.getComputer();

        System.out.println(computer2.toString());

    }
}
