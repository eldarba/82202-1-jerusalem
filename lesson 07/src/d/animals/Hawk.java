package d.animals;

public class Hawk extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a Hawk");

	}

	@Override
	public void fly() {
		System.out.println("fly like a Hawk");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Hawk");
	}

}
