import GUI_Full.GUI;

public class Main {

    public static void main(String[] args) {
        DiceCarrier dc = DiceCarrier.getInstance();

        GameLogic gameLogic = new GameLogic();

        gameLogic.startGame();
    }
}
