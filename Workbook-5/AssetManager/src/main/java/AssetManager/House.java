package AssetManager;

public class House extends Asset {

    String address;
    int condition;
    int squareFoot;
    int lotsize;

    //Super Constructor
    public House(String dateAcquired, String description, double originalCost, String address, int condition, int lotsize, int squareFoot) {
        super(dateAcquired, description, originalCost);
        this.address = address;
        this.condition = condition;
        this.lotsize = lotsize;
        this.squareFoot = squareFoot;
    }

    //Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotsize() {
        return lotsize;
    }

    public void setLotsize(int outsize) {
        this.lotsize = outsize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    //Todo: work in this method
    @Override
    public double getValue() { // passing variable ''condition' as a check in the switch statement because the value of the house depends on the 'condition'.
        return switch (getCondition()) { // returning a value because this method has to return a double datatype.
            case 1 -> (180 * getSquareFoot() + 0.25 * getLotsize());
            case 2 -> (130 * getSquareFoot() + 0.25 * getLotsize());
            case 3 -> (90 * getSquareFoot() + 0.25 * getLotsize());
            case 4 -> (80 * getSquareFoot() + 0.25 * getLotsize());
            default -> 0;
        };

        //180 * squareFoot + 0.25 * lotSize excellent
        //130 * squareFoot + 0.25 * lotSize good
        //90 * squareFoot + 0.25 * lotSize fair
        //80 * squareFoot + 0.25 * lotSize poor


    }


}
