package test_bridge_pattern;

public class TestBridge {
	public static void test(){
	Shape redCircle=new Circle(new RedCircle());
	Shape greenCircle=new Circle(new GreenCircle());
	
	
	redCircle.draw();
	greenCircle.draw();
	}

}
