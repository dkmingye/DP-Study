package test_bridge_pattern;

public class Circle extends Shape {

	public Circle(DrawAPI drawApi) {
		super(drawApi);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		drawApi.drawCircle();
	}

}
