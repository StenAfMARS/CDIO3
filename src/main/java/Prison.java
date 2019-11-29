public class Prison extends Felt{
    Player owner = new Player("AI",0);

    void playerAction(Player player) {
        player.isPrisoned = true;
        player.setPos(6);
        player.toggleTurn();
    }

    public Player getOwner(){
        return this.owner;
    }
}
