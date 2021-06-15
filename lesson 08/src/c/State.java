package c;

public class State {

	private String name;
	private int population;
	private int area;
	private static int worldPopulation;

	public State(String name, int area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public static int getWorldPopulation() {
		return worldPopulation;
	}

	@Override
	public String toString() {
		return "State [name=" + name + "]";
	}

	public class Citizen {
		private final int id;
		private String name;

		public Citizen(String name) {
			super();
			population++;
			worldPopulation++;
			this.name = name;
			this.id = population;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public String getStateName() {
			return State.this.name;
		}

		@Override
		public String toString() {
			return "Citizen [id=" + id + ", name=" + name + "]";
		}

	}

}
