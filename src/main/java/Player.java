import java.util.Scanner;

public class Player {

    String name;
    int money;
    int pos;
    boolean isPrisoned;
    boolean endTurn;
    boolean jailFreeCard;
    boolean isBirthday;

    Scanner keyboard = new Scanner(System.in);

    //Method that gives a player its name
    public Player(String name, int money){
        this.endTurn = false;
        this.isPrisoned = false;
        this.jailFreeCard = false;
        this.pos = 0;
        this.name = name;
        this.money = money;
        this.isBirthday = false;
    }

    public void updatePos(int num){
        int newPos = num + this.getPos();
        if (newPos > 23){
            this.setPos(newPos-23);
        } else{
            this.setPos(newPos);
        }
    }
    public void checkStartField(int startPos){
        if (startPos > this.getPos()){
            this.setMoney(this.getMoney() + 2);
        }
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

    public int getPos() { return pos; }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public void toggleTurn() {
        this.endTurn = !this.endTurn;
    }
    public void toggleJailCard() {
        this.jailFreeCard = !this.jailFreeCard;
    }
    public void toggleBirthday() {
        this.isBirthday = !this.isBirthday;
    }
    public boolean getTurn() {
        return this.endTurn;
    }


}


