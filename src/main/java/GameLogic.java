import java.util.Scanner;

public class GameLogic {

    Scanner keyboard = new Scanner(System.in);

    public void startGame() {

        int playerNumber;

        System.out.println("how many gamers are there????");
        playerNumber = keyboard.nextInt();

        if (playerNumber > 1 || playerNumber < 4) {
            GameFlow gameFlow(generatePlayers());
        } else {
            System.out.println("There can only be 2-4 players :'(");
            startGame();
        }
    }

    private Player[] generatePlayers(int playerNumber) {
        int money;
        Player[] players = new Player[playerNumber];

        if (playerNumber == 2) {
            money = 20;
        }
        if (playerNumber == 3) {
            money = 18;
        }
        if (playerNumber == 4) {
            money = 16;
        } else {
            money = 0;
        }

        for (int i = 0; i < playerNumber; i++) {
            System.out.println("Give me your name");

            String name = keyboard.nextLine();

            players[i] = new Player(name, money);
        }
        return players;
    }
}
