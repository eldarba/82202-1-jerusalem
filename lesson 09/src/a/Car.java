package a;

public class Car {

	private int number;
	private Color color;
	private Mode mode = Mode.OFF;

	public Car(int number, Color color) {
		super();
		this.number = number;
		this.color = color;
	}

	public enum Mode {
		ON, OFF, STAND_BY
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + ", mode=" + mode + "]";
	}

}
