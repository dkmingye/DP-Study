package test_abstract_factory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("circle")){
			return new Circle();
		} else if(type.equalsIgnoreCase("square")){
			return new Square();
		}else if(type.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

}
