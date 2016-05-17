package bike;

//A subclass does not inherit the private members of its parent class. 
//However, if the superclass has public or protected 
//methods for accessing its private fields, 
//these can also be used by the subclass.sssss

class Bicycle {
	// the Bicycle class has three fields
    public int cadence=33;
    public int gear=44;
    public int speed=55;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    public Bicycle() {
   
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
   }
}
