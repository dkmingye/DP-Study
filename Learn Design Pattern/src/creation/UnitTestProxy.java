package creation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestProxy {

	@Test
	public void test() {
		Image myImage=new ProxyImage("dog.gif");
		myImage.Display();
		myImage.Display();
		myImage.Display();
		myImage.Display();
		//fail("");
	}

}
