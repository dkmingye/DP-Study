package factory_pattern;

public class TestFactoryPattern {
	public static void test(){
		ShapeFactory shapeFactory = new ShapeFactory();

	    //get an object of Circle and call its draw method.
	    Xshape shape1 = shapeFactory.getShape("CIRCLE");

	    //call draw method of Circle
	    shape1.draw();

	    //get an object of Rectangle and call its draw method.
	    Xshape shape2 = shapeFactory.getShape("RECTANGLE");

	    //call draw method of Rectangle
	    shape2.draw();

	    //get an object of Square and call its draw method.
	    Xshape shape3 = shapeFactory.getShape("SQUARE");

	    //call draw method of circle
	    shape3.draw();
		
	}
	
	

}
