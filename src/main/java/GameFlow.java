import java.util.Scanner;

public class GameFlow {
    Player[] players;
    Dices dices = new Dices(6);
    Scanner keyboard = new Scanner(System.in);
    int[] field;
    boolean gameOver = false;


    public GameFlow(Player[] players) {
        this.players = players;
        this.field = generateField();
    }

    public int[] generateField() {
        int[] field;

    }
}
