package a;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(int val) {
		this(val, val);
	}

	public void moveRight() {
		x++;
	}

	public void reset() {
		x = 0;
		y = 0;
	}

	// method overloading - same method name, different parameters
	public void moveRight(int steps) {
		x += steps;
	}

	public void moveLeft() {
		x--;
	}

	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("Point(" + x + ", " + y + ")");
	}
}
