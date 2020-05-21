// Vehicle
//     |       |     |
//     |       |     |
//     Car: Truck   SUV 
//     |
//     |
//     HybridCar
public class HybridCar extends Car{
    private long batteryLife, MPG;
    private String chargerType;

    //Simple Car constructor inheriting all of the methods and properties of 
    //Vehicle
    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, int batteryLife, int MPG, String chargerType, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }

    //Getters
    public int getBatteryLife(){
        return this.batteryLife;
    }
    public int getMPG(){
        return this.MPG;
    }
    public int getChargerType(){
        return this.chargerType;
    }

    //Setters
    public void setBatteryLife (long batteryLife){
        this.batteryLife = batteryLife;
    }
    public void setMPG(long MPG){
        this.MPG = MPG;
    }
    public void setChargerType(String chargerType){
        this.chargerType = chargerType;
    }
}

