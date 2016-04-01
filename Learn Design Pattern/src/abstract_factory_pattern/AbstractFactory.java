package abstract_factory_pattern;

public abstract class AbstractFactory {
	
	abstract Xshape getShape(String shape);
	abstract Xcolor getColor(String color);

}
