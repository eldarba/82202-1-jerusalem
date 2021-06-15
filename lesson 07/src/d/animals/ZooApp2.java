package d.animals;

public class ZooApp2 {

	public static void main(String[] args) {
		Flyer f = new Bat();
		f.glide();

		f = new Hawk();
		f.glide();
	}

}
