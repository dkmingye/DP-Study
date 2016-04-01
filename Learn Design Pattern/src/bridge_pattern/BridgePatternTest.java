package bridge_pattern;

public class BridgePatternTest {
	public static void test() {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
}
