package test_abstract_factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String type){
		
		if(type.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}else {
			return null;
		}
	}

}
