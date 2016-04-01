package bike;


//Implementing an interface allows a class to become
//more formal about the behavior it promises to provide. 
public class MyBike implements BikeInterface{
	int cadence = 1;
    int speed = 0;
    int gear = 1;
    
    public MyBike(int cadence,int speed,int gear){
    	this.cadence=cadence;
    	this.speed=speed;
    	this.gear=gear;
    }
    
	@Override
	public void changeCadence(int newValue) {
		cadence = newValue;
		
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
		
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment; 
		
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
		
	}
	
	void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
   }

}
