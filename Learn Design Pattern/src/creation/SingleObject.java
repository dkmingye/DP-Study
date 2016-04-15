package creation;

public class SingleObject {
	private static SingleObject theOne=new SingleObject();
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		return theOne;
	}
	
	public void SayHello(){
		System.out.println("Hello~~");
	}

}
