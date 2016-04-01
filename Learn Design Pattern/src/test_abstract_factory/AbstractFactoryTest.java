package test_abstract_factory;

public class AbstractFactoryTest {
	
	public static void test(){
     //get shape factory
	 AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
	 Shape circle1=shapeFactory.getShape("Circle");
	 Shape square1=shapeFactory.getShape("square");
	 circle1.draw();
	 square1.draw();
	}

}
