import java.util.Scanner;

public class GameFlow {
    Player[] players;
    Dices dices = new Dices(6);
    Scanner keyboard = new Scanner(System.in);
    int[] field;
    boolean gameOver = false;


    public GameFlow() {

        this.field = generateField();

    }

    public int[] generateField() {
        int[] field = new int[16];

        return field;
    }
}
