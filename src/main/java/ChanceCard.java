import java.util.Random;

public class ChanceCard {

    int[] ch = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

    public int drawCard(){

        Random r = new Random();
        int randomNumber = r.nextInt(ch.length);
        System.out.println(ch[randomNumber]);

        return ch[randomNumber];
    }


}

//"ch18",
//            "skibet", "bilen", "hunden", "katten", "ch19", "ch20"