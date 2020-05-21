 //Interface normally follow a naming convention similar 2 classes
   // but they end in -'ible' or 'able' 
   //usually adjective becasue we interface to provide additional capabilities

interface Leaseable {

    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    default float getMileabePenalty(){
        return 500.0f;
    }
}