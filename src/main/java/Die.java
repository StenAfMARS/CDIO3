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
        _numberOfFaces = faces;
    }

    public int get_lastRollValue(){

        return _lastRollValue;
    }

    private int dieRoll(){

        _lastRollValue = (int) (Math.random() * _numberOfFaces + 1);

        return _lastRollValue;
    }


}
