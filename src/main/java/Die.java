public class Die {
    private int _lastRollValue;
    private int _numberOfFaces;

    public Die(int numberOfFaces){
        this._numberOfFaces = numberOfFaces;
    }

    public int getFaces(){
        return _numberOfFaces;
    }

    public void setFaces(int faces){
        this._numberOfFaces = faces;
    }

    public int getLastRollValue(){
        return _lastRollValue;
    }

    private int dieRoll(){

        _lastRollValue = (int) (Math.random() * _numberOfFaces + 1);

        return _lastRollValue;
    }
}
