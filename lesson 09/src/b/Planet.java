package b;

public enum Planet {

	MERCURY(22, 100), VENUS(30, 200), EARTH(45, 300), MARS(58, 400);

	public final int mass;
	private int orbit;

	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	public int getOrbit() {
		return orbit;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

}
