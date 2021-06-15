package a;

public class Square extends Rectangle {

	public Square(String color, int side) {
		super(color, side, side);
	}

	@Override
	public String toString() {
		return "Square [length=" + getLength() + ", width=" + getWidth() + ", color=" + getColor() + "]";
	}

	@Override
	public void setLength(int length) {
		super.setLength(length);
		super.setWidth(length);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setLength(width);
	}

}
