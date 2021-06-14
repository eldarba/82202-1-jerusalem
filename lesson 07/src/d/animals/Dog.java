package d.animals;

public class Dog extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a Dog");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Dog");
	}

}
