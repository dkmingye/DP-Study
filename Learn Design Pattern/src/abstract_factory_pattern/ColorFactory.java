package abstract_factory_pattern;

public class ColorFactory extends AbstractFactory{
	

	@Override
	Xshape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Xcolor getColor(String color) {
		if(color.equalsIgnoreCase("Green")){
			return new Green();
		} else if(color.equalsIgnoreCase("Red")){
			return new Red();			
		}
		return null;
	}
}
