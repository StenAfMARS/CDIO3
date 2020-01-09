public class Neutral extends Felt {
    int neutralPos;
    Player owner = new Player("AI",0);

    public Neutral(int neutralPos){
        this.neutralPos = neutralPos;
    }
    void playerAction(Player player) {
        String msg;
        switch (neutralPos){
            case 0:
                msg = "Velkommen til Start";
                break;
            case 1:
                msg = "På besøg i fængslet! Nyd dit ophold";
                break;
            case 2:
                msg = "Gratis parkering. Lucky you!";
                break;
            default:
                msg = "";
        }
        System.out.println(msg);
        player.toggleTurn();
    }

    public Player getOwner(){
        return this.owner;
    }
}
