package d.animals;

public interface Flyer {

	// constants
	int MAX_ALT = 1000;

	// abstract method
	void fly();

	// default method
	default void glide() {
		System.out.println("gliding like a flyer");
	}

}
