package bike;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {		
		Bicycle mBike=new MountainBike(1,2,3,4);
	    mBike.printStates();
	    Bicycle tBike=new TinyBike();
	    tBike.printStates();
	    MyBike mybike1=new MyBikeOne(22,22,22);
	    MyBike mybike2=new MyBikeTwo(33,33,33);
	    if(mybike2 instanceof MyBikeTwo){
	    	mybike2.changeCadence(999);
	    }
	    
	    mybike2.printStates();
		//fail("Not yet implemented");
	}

}
