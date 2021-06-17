package d;

public class Test {

	public static void main(String[] args) {

		// handling 2 - try-catch
		try {
			Person p = new Person();
			p.setAge(2244);
			System.out.println(p);
		} catch (IllegalAgeException e) {
			System.out.println("error");
			System.out.println("age setting failed: " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			// do it anyway block
			System.out.println("from finally");
		}

		System.out.println("END");

	}

}
