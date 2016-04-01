package test_bridge_pattern;

public abstract class Shape {
	DrawAPI drawApi;
	public Shape(DrawAPI drawApi){
		this.drawApi=drawApi;
	}
	
	public abstract void draw();
	
	
}
