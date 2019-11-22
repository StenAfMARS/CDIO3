import java.util.Scanner;

public class Player {

    String name;
    int money;

    Scanner keyboard = new Scanner(System.in);

    //Method that gives a player its name
    public Player(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {

        return name;
    }

    //Method for getting the points of a player in the system
    public int getMoney() {
        return money;
    }

    //Method for setting the points of the player after a turn
    public void setMoney(int money) {
        this.money = money;
    }

    private Player[] generatePlayers(int playerNumber) {
        int money;


        GameLogic gameLogic = new GameLogic();
        playerNumber = gameLogic.getAntalPlayer();



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


