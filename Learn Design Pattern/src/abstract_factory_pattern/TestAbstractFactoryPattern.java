package abstract_factory_pattern;

public class TestAbstractFactoryPattern {
	public static void test(){
		 //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //get an object of Shape Circle
	      Xshape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Shape Circle
	      shape1.draw();

	      //get an object of Shape Rectangle
	      Xshape shape2 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Shape Rectangle
	      shape2.draw();
	      
	      //get an object of Shape Square 
	      Xshape shape3 = shapeFactory.getShape("SQUARE");

	      //call draw method of Shape Square
	      shape3.draw();

	      //get color factory
	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

	      //get an object of Color Red
	      Xcolor color1 = colorFactory.getColor("RED");

	      //call fill method of Red
	      color1.fill();

	      //get an object of Color Green
	      Xcolor color2 = colorFactory.getColor("Green");

	      //call fill method of Green
	      color2.fill();
		
	}
	
	

}
