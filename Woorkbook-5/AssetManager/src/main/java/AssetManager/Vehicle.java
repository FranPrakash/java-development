package AssetManager;

import java.time.LocalDate;

public class Vehicle extends Asset{

   String makeModel;
   int year;
   int odometer;

   //Constructor
    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int odometer, int year) {
        super(dateAcquired, description, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    //Getters and Setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//TODO:Work in this method
    @Override
    public double getValue() {
        double result = getOriginalCost();
        int age = LocalDate.now().getYear() - year;
        if (age <= 3) {
            result = result * Math.pow((0.97, year);
        } else if ( age <= 6) {
            result = result * Math.pow(0.92, year);
        }else {
            result = 1000;
            if(odometer > 10000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota"));{
                result = result * 0.75;
        }
    }

        return originalCost;
    }
}
