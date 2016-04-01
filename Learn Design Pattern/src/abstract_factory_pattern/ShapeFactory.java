package abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	 public Xshape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }

	@Override
	Xcolor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
