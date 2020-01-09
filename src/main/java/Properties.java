public class Properties extends Felt{
    String color;
    int price;
    boolean isOwned;
    Player owner;

    public Properties(String color, int price){
        this.color = color;
        this.price = price;
        this.isOwned = false;
        this.owner = null;
    }

    public void playerAction(Player player) {
        if (!isOwned) {
            if (player.money >= price){
                player.setMoney(player.money - price);
                isOwned = true;
                owner = player;
            }
            else{
                System.out.println("Insufficient funds");
            }
        } else {
            player.setMoney(player.money - price);
            owner.setMoney(owner.money + price);
        }
        player.toggleTurn();
    }

    public Player getOwner(){
        return this.owner;
    }
}
