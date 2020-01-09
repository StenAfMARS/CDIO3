/**
 * Singmodel object for a dice carrier.
 * @version 1.2
 */
public class DiceCarrier {

    private static DiceCarrier single_instance = null;
    private int _numberOfDice;

    private DiceCarrier(){ }

    /**
     * @return DiceCarrier object.
     */
    public static DiceCarrier getInstance()
    {
        if(single_instance == null)
            single_instance = new DiceCarrier();

        return single_instance;
    }


    /**
     * Roll one die and return face value.
     * @param numberOfFaces specifies number of faces on die.
     * @return Face value of die.
     */
    public int rollDie(int numberOfFaces){
        return  diceRoll(numberOfFaces);
    }


    /**
     *Throw specified number of dice with x amount of faces and return total sum.
     * @param numberOfDice Specifies the number of dice to roll in each throw
     * @param numberOfFaces Specifies the number of faces for each die.
     * @return Total value of rolled dice.
     */
    public int rollDice(int numberOfDice, int numberOfFaces){
        int sum=0;

        for (int i = 0; i < numberOfDice ; i++) {
            sum = sum + diceRoll(numberOfFaces);
        }

        return sum;
    }

    /**
     * Simulates the throw of a die.
     * @param numberOfFaces Specifies the number of faces on the simulated die.
     * @return Returns face value of die.
     */
    private int diceRoll(int numberOfFaces){

        int faceValue = (int) (Math.random() * numberOfFaces + 1);

        return faceValue;

    }

}
