package kardealership;

public class Car extends Vehicle {
    //Simple Car constructor inheriting all of the methods and properties of 
    //Vehicle
    public Car (String VIN, double wholesaleCost, double retailPrice, int
    modelYear, String make, String model, String color){
        super (VIN,wholesaleCost, retailPrice, modelYear, make, model, color);
    }

    @Override
    public double getTargetMargin() b{
        return super.getTargetMargin() - 1000;
        //use the getTargetMargin method as its defined in our superclass(Vehicle)
    }
}