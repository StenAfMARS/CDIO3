public class Player {

    String name;
    int money;

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

}