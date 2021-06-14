package a;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		return x + 2 * y * 3000 + 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Point)) {
			return false;
		}
		// if we are here then obj is a Point
		Point other = (Point) obj;
		return this.x == other.x && this.y == other.y;

// 		if you like the longer way
//		if (this.x == other.x && this.y == other.y) {
//			return true;
//		} else {
//			return false;
//		}

	}

}
