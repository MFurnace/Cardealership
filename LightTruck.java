public class LightTruck {
    
    public class LightTruck extends Vehicle{
        //Simple LightTruck constructor inheriting all of the methods and properties of 
        //Vehicle
        private long towingCapacity, grossCombinedWeight, truckWeight;
        private boolean is4wd;

        public LightTruck (String VIN, double wholesaleCost, double retailPrice, int
        modelYear, String make, String model, String color long towingCapacity, long truckWeight, boolean 
        is4wd) {

            super (VIN,wholesaleCost, retailPrice, modelYear, make, model, color);
            this.towingcapacity = towingCapacity;
            this.truckWeight = truckWeight;
            this.is4wd = is4wd;
            this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
        }

        //Getters
        public long getTowingCapacity(){
            return this.towingCapacity;
        }
        public long getTruckWeight(){
            return this.truckWeight;
        }
        public long getGrossCombinedWeight(){
            return this.grossCombinedWeight;
        }
        public boolean is4wd(){
            return this.is4wd;
        }

        //Setters
        public void setTowingCapacity(long towingCapacity){
            this.towingCapacity = towingCapacity;
        }
        public void setTruckWeight(long truckWeight){
            this.truckWeight = truckWeight;
        }
        //Method to automatically calculate GCW if no params are given
        public void setGrossCombinedWeight(long weight){
            this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
        }
        //Method Overload to manually set GCW if params are given
        public void setGrossCombinedWeight(long weight){
            this.grossCombinedWeight = weight;
        }
        public void setis4wd(boolean is4wd){
            this.is4wd = is4wd;
        }

        @Override
        public String toString(){
            //Get the string output from our "default" superClass method
            // Example: 2018 Kia Sorrento
            //and store that in a variable for us to use
            String str = super.toString();
            //if 4wd, signify that in return string
            if (is4wd){
                str += ", (4 WD)"; //appends string to end of our str variable
            }
            return str;
        }
}