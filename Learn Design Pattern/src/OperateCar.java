public interface OperateCar {

	// constant declarations, if any

	// method signatures

	// An enum with values RIGHT, LEFT
	int turn(String direction, double radius, double startSpeed, double endSpeed);

	int changeLanes(String direction, double startSpeed, double endSpeed);

	int signalTurn(String direction, boolean signalOn);

	// more method signatures
}
