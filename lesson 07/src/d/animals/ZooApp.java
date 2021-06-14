package d.animals;

public class ZooApp {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Bat();
		animals[3] = new Ant();
		animals[4] = new Butterfly();
		animals[5] = new Ostrich();
		animals[6] = new Dog();
		animals[7] = new Dog();
		animals[8] = new Hawk();
		animals[9] = new Butterfly();

		for (Animal animal : animals) {
			if (animal != null) {
				animal.speak();
				if (animal instanceof AdvancedFlyer) {
					// switch reference to call other methods
					AdvancedFlyer flyer = (AdvancedFlyer) animal;
					flyer.takeOff();
					flyer.fly();
					flyer.navigate();
					flyer.land();
				} else if (animal instanceof Flyer) {
					((Flyer) animal).fly();
				} else if (animal instanceof Navigator) {
					((Navigator) animal).navigate();
				}
			}

			System.out.println("==============");
		}

	}

}
