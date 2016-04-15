package creation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestSingleton {

	@Test
	public void test() {
		SingleObject instance=SingleObject.getInstance();
		instance.SayHello();
	}

}
