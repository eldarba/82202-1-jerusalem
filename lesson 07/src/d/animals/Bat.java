package d.animals;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("speak like a Bat");
	}

	@Override
	public void fly() {
		System.out.println("fly like a Bat");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Bat");
	}

	@Override
	public void land() {
		System.out.println("land like a Bat");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a Bat");
	}

	// override the default implementation in the interface
	@Override
	public void glide() {
		System.out.println("glide like a Bat");
	}

}
