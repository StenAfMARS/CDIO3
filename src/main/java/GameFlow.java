import gui_fields.GUI_Player;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.util.Scanner;

public class GameFlow {
    Player[] players;
    Die die = new Die(6);
    Scanner keyboard = new Scanner(System.in);
    Felt[] field;
    GUI gui;
    MonopolyPlayerGUI playerGUI;
    MonopolyBoardGUI board;
    boolean gameOver = false;
    GameLogic gml = new GameLogic();


    public GameFlow(int playerNumber) {
        this.field = generateField();
        this.players = generatePlayers(playerNumber);
        this.board = new MonopolyBoardGUI();
        this.gui = new GUI(board.fields);
        this.playerGUI = new MonopolyPlayerGUI(players);
        for (int i = 0; i < playerNumber; i++){
            gui.addPlayer(playerGUI.players[i]);
            gui.getFields()[0].setCar(playerGUI.players[i], true);
        }
        



    }

    private Felt[] generateField() {
        Felt[] field = new Felt[24];
        for (int i = 0; i < 3; i++){
            field[i*6] = new Neutral(i);
        }
        for (int i = 3; i < 24; i = i+6){
            field[i] = new ChanceField();
        }

        field[1] = new Properties("Brown", 1);
        field[2] = new Properties("Brown", 1);

        field[4] = new Properties("Teal", 1);
        field[5] = new Properties("Teal", 1);

        field[7] = new Properties("Pink", 2);
        field[8] = new Properties("Pink", 2);

        field[10] = new Properties("Orange", 2);
        field[11] = new Properties("Orange", 2);

        field[13] = new Properties("Red", 3);
        field[14] = new Properties("Red", 3);

        field[16] = new Properties("Yellow", 3);
        field[17] = new Properties("Yellow", 3);

        field[19] = new Properties("Green", 4);
        field[20] = new Properties("Green", 4);

        field[22] = new Properties("Blue", 5);
        field[23] = new Properties("Blue", 5);

        field[18] = new Prison();

        return field;
    }


    private Player[] generatePlayers(int playerNumber) {
        int money = 0;

        Player[] players = new Player[playerNumber];



        if (playerNumber == 2) {
            money = 20;
        }
        if (playerNumber == 3) {
            money = 18;
        }
        if (playerNumber == 4) {
            money = 16;
        }

        for (int i = 0; i < playerNumber; i++) {
            System.out.println("Player " + (i+1) + " give me your name");

            String name = keyboard.nextLine();

            players[i] = new Player(name, money);

            System.out.println("Player " + (i+1) + " is named: "+ players[i].name);
        }
        System.out.println("Your starting money is: " + money);
        return players;

    }

    public void turnHandler() {
        int turn = 0;
        while (!gameOver) {
            int currentTurn = turn % players.length;
            Player currentPlayer = players[currentTurn];
            System.out.println(currentPlayer.name + "'s tur.\n Du har " + currentPlayer.getMoney() + " mønter");
            int startPos = currentPlayer.getPos();
            players[currentTurn].toggleTurn();

            int roll = diceThrowGUI();
            currentPlayer.updatePos(roll);
            updateGUIPos(startPos, currentTurn);
            System.out.println("Du slog " + roll);

            while(currentPlayer.getTurn()){
                currentPlayer.checkStartField(startPos);

                if (isChance (field[currentPlayer.getPos()]) || isPrison(field[currentPlayer.getPos()])) {
                    startPos = currentPlayer.getPos();
                }

                field[currentPlayer.getPos()].playerAction(currentPlayer);

                if (isProperty(field[currentPlayer.getPos()])){
                    if (isSameOwner(field[currentPlayer.getPos()],currentPlayer.getPos())){
                        field[currentPlayer.getPos()].playerAction(currentPlayer);
                        currentPlayer.toggleTurn();
                    }
                }

                updateGUIPos(startPos, currentTurn);

                if(currentPlayer.getMoney() < 0){
                    System.out.println("Gameover! " + currentPlayer.getName() + " Loses");
                    gameOver = true;
                }
            }

            turn++;
        }
    }

    public int diceThrowGUI(){
        this.gui.showMessage("Slå med terningen");
        int roll = die.dieRoll();
        this.gui.setDie(roll);

        return roll;
    }

    private void updateGUIPos(int startPos, int currentTurn){
        this.gui.getFields()[startPos].setCar(playerGUI.players[currentTurn], false);
        this.gui.getFields()[players[currentTurn].getPos()].setCar(playerGUI.players[currentTurn], true);
    }

    private boolean isProperty(Felt testField){
        return testField.getClass() == field[1].getClass();
    }

    private boolean isSameOwner(Felt testField, int pos) {
        return testField.getOwner() == field[pos - 1].getOwner() ||
                testField.getOwner() == field[(pos + 1) % 24].getOwner();
    }
    private boolean isChance (Felt testField){
        return testField.getClass() == field[3].getClass();
    }
    private boolean isPrison (Felt testField){
        return testField.getClass() == field[18].getClass();
    }
}



