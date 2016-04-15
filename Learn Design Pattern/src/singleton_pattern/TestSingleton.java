package singleton_pattern;

public class TestSingleton {
	
	public static void test(){
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      

	      //show the message
	      object.showMessage();
		
	}
}
