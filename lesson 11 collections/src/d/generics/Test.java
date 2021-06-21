package d.generics;

public class Test {

	public static void main(String[] args) {

		Box<String> boxOfString = new Box<>();
		boxOfString.setContent("aaa");
		System.out.println(boxOfString.getContent());

		Box<Integer> boxOfInteger = new Box<>();
		boxOfInteger.setContent(5);
		System.out.println(boxOfInteger.getContent());
	}

}
