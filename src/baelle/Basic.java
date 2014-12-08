package baelle;
import ballworld.Ball;
import ballworld.World;
import cs101.lang.Animate;


abstract class Basic implements Ball, Animate {

	public World world;
	public double radius;
	public double x;
	public double y;
	
	public void act() {
	}

	public double getRadius() {
		return radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setWorld(World arg0) {
		world = arg0;
	}

	public void userClicked(double arg0, double arg1) {
	}

	public void userTyped(char arg0) {
	}
}
