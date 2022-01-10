package BuilderPattern2;

public class ComputerFactory {

    private BluePrint print;

    public void make() {
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer() {
        return print.getComputer();
    }

    public void setBlueprint(BluePrint blueprint) {
        this.print = blueprint;
    }
}
