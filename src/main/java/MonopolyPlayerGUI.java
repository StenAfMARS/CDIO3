import gui_fields.GUI_Player;
import gui_fields.GUI_Car;
import gui_main.GUI;

import java.awt.*;

public class MonopolyPlayerGUI {
    Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.ORANGE};
    GUI_Player[] players;
    GUI_Car[] cars;
    public MonopolyPlayerGUI(Player[] playerArray){
        this.players = new GUI_Player[playerArray.length];
        this.cars = new GUI_Car[playerArray.length];

        for (int i = 0; i < playerArray.length; i++) {
            cars[i] = new GUI_Car(colors[i], colors[i], GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            players[i] = new GUI_Player(playerArray[i].name, playerArray[i].money, cars[i]);
        }
    }
}
