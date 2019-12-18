import java.util.Scanner;

public class ChanceField extends Felt {
    Player owner = new Player("AI",0);

    Scanner keyboard = new Scanner(System.in);
    ChanceCard card = new ChanceCard();

    void playerAction(Player player) {
        cardEffect(player);
    }

    public Player getOwner(){
        return this.owner;
    }

    private void cardEffect(Player player){

        //some psudocode in the switch case
        switch (card.drawCard()){
            case 1:

                break;
            case 2:
                player.setPos(0);
                player.toggleTurn();
                break;
            case 3:
                System.out.println("Ryk op til 5 felter frem, indtast et tal mellem 0 og 5");
                int num = keyboard.nextInt();
                if (num >= 0 && num <= 5){
                    player.updatePos(num);
                }
                break;
            case 4:
                System.out.println("Ryk til et orange felt, indtast enten felt 10 eller 11");
                int ch4 = 0;
                while (!(ch4 == 10 || ch4 == 11)){
                    ch4 = keyboard.nextInt();
                }
                player.setPos(ch4);
                break;
            case 5:
                System.out.println("Ryk ét felt frem, eller tag et nyt chancekort.\n Indtast 0 eller 1");
                int ch5 = keyboard.nextInt();
                while (!(ch5 == 1 || ch5 == 0)){
                    ch5 = keyboard.nextInt();
                }
                if (ch5 == 1) {
                    player.setPos(ch5);
                }
                break;
            case 6:
                player.setMoney(player.getMoney() - 2);
                player.toggleTurn();
                break;
            case 7:
                System.out.println("Ryk til enten et orange eller grønt felt, indtast enten felt 10, 11, 20 eller 21");
                int ch7 = 0;
                while (!(ch7 == 10 || ch7 == 11 || ch7 == 20 || ch7 == 21)){
                    ch7 = keyboard.nextInt();
                }
                player.setPos(ch7);
                break;
            case 8:
                System.out.println("Ryk til et lyseblåt felt, indtast enten felt 4 eller 5");
                int ch8 = 0;
                while (!(ch8 == 4 || ch8 == 5)){
                    ch8 = keyboard.nextInt();
                }
                player.setPos(ch8);
                break;
            case 9:
                player.toggleJailCard();
                break;
            case 10:
                player.setPos(23);
                break;
            case 11:
                player.toggleBirthday();
                player.toggleTurn();
                break;
            case 12:
                System.out.println("Ryk til enten et pink eller mørkeblåt felt, indtast enten felt 7, 8, 22 eller 23");
                int ch12 = 0;
                while (!(ch12 == 7 || ch12 == 8 || ch12 == 22 || ch12 == 23)){
                    ch12 = keyboard.nextInt();
                }
                player.setPos(ch12);
                break;
            case 13:
                System.out.println("Sick shit. Du blevet færdig med CDIO, du får 2 bajere");
                player.setMoney(player.getMoney() + 2);
                player.toggleTurn();
                break;
            case 14:
                System.out.println("Ryk til et rødt felt, indtast enten felt 13 eller 14");
                int ch14 = 0;
                while (!(ch14 == 13 || ch14 == 14)){
                    ch14 = keyboard.nextInt();
                }
                player.setPos(ch14);
                break;
            case 15:
                player.setPos(10);
                break;
            case 16:
                System.out.println("Ryk til enten et lyseblåt eller rødt felt, indtast enten felt 4, 5, 13 eller 14");
                int ch16 = 0;
                while (!(ch16 == 4 || ch16 == 5 || ch16 == 13 || ch16 == 14)){
                    ch16 = keyboard.nextInt();
                }
                player.setPos(ch16);
                break;
            case 17:
                System.out.println("Ryk til enten et brunt eller gult felt, indtast enten felt 1, 2, 16 eller 17");
                int ch17 = 0;
                while (!(ch17 == 1 || ch17 == 2 || ch17 == 16 || ch17 == 17)){
                    ch17 = keyboard.nextInt();
                }
                player.setPos(ch17);
                break;

            default:
                break;

        }
    }
}
