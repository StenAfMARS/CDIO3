import GUI_Full.GUI;

public class Main {

    public static void main(String[] args) {

        DiceCarrier dc = DiceCarrier.getInstance();

        GUI gui = new GUI();

        gui.getFields();

        System.out.println();
    }
}
