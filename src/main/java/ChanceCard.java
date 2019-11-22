import java.util.Random;

public class ChanceCard {

    String[] ch = {"ch1", "ch2", "ch3", "ch4",
            "ch5", "ch6", "ch7", "ch8", "ch9", "ch10", "ch11",
            "ch12", "ch13", "ch14", "ch15", "ch16", "ch17", "ch18",
            "skibet", "bilen", "hunden", "katten", "ch19", "ch20"};

    public String drawCard(){

        Random r = new Random();
        int randomNumber = r.nextInt(ch.length);
        System.out.println(ch[randomNumber]);

        return ch[randomNumber];
    }

   /* private void cardEffect(){

        //some psudocode in the switch case
        switch (drawCard()){
            case "ch1":

                break;
            case "ch2":
            //currentplayer.posision = start[];
            //currentplayer.getStartmoney;
                break;
            case "ch3":
            //scanner
            //currentplayer.posision = posision[]+input.nextInt;
                break;
            case "ch4":

                break;
            case "ch5":
                /*System.out.println("vælg???");
                if(input.equals(1))
                    currentplayer.posistion = posision[]+1;
                else
                    try again?????
                break;
            case "ch6":

                break;
            case "ch7":
            //currentplayer.setMoney = getMoney -2;
                break;
            case "ch8":

                break;
            case "ch9":

                break;
            case "ch10":

                break;
            case "ch11":

                break;
            case "ch12":

                break;
            case "ch13":

                break;
            case "ch14":

                break;
            case "ch15":

                break;
            case "ch16":

                break;
            case "ch17":

                break;
            case "ch18":

                break;
            case "skibet":

                break;
            case "bilen":

                break;
            case "hunden":

                break;
            case "katten":

                break;
            case "ch19":

                break;
            case "ch20":

                break;

        }
    }*/

}
