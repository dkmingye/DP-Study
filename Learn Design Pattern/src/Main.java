import mvc_pattern.MvcPatternTest;
import prototype_pattern.PrototypePatternTest;
import proxy_pattern.ProxyPatternTest;
import singleton_pattern.TestSingleton;
import test_abstract_factory.AbstractFactoryTest;
import test_bridge_pattern.TestBridge;
import EnumTest.EnumTest;
import abstract_factory_pattern.AbstractFactory;
import abstract_factory_pattern.TestAbstractFactoryPattern;
import bike.*;
import builder_pattern.TestBuilderPattern;
import factory_pattern.TestFactoryPattern;;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		//test inner/outer class and private method
//		Mycar newcar=new Mycar(99);
//		Mycar.theTier tier= new Mycar.theTier();
//		Mycar.theTier.printTierSize();
//		newcar.printNum();
//		// test interface
//		OperateBMWX opbmw=new OperateBMWX();
//		opbmw.signalTurn("", true);
//		opbmw.turn("", 1.1, 11, 111);
//		opbmw.changeLanes("", 1, 1);
		
		//test inheritance
//		MountainBike mBike=new MountainBike(1,2,3,4);
//	    mBike.printStates();
//	    TinyBike tBike=new TinyBike();
//	    tBike.printStates();
		
		//TestFactoryPattern.test(); 
		//TestAbstractFactoryPattern.test();
		//TestSingleton.test();
		//TestBuilderPattern.test();
		//EnumTest.test();
		//PrototypePatternTest.test();
		//MvcPatternTest.test();
		//TestBridge.test();
		//AbstractFactoryTest.test();
		ProxyPatternTest.test();
	}

}
