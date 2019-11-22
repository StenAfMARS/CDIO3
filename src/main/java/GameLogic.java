import GUI_Full.GUI;

import java.util.Scanner;

public class GameLogic {

    Scanner keyboard = new Scanner(System.in);

    int playerNumber = 0;

    public void startGame() {



        System.out.println("how many gamers are there????");
        playerNumber = keyboard.nextInt();


        if (playerNumber > 1 || playerNumber <= 4) {
            GameFlow gameFlow = new GameFlow();
            gameFlow.generateField();


        } else {
            System.out.println("There can only be 2-4 players :'(");
            startGame();

        }
    }

    public int getAntalPlayer()
    {
        return playerNumber;
    }

    public void setAntalPlayer(int playerNumber)
    {
        this.playerNumber = playerNumber;
    }
}
