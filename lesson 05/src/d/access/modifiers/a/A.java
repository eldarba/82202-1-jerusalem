package d.access.modifiers.a;

public class A {

	public int nPublic = 1; // most open
	protected int nProtected = 2;
	int nDefault = 3;
	private int nPrivate = 4; // most closed

	public void m() {
		A a = new A();
		System.out.println(a.nPublic);
		System.out.println(a.nProtected);
		System.out.println(a.nDefault);
		System.out.println(a.nPrivate);
	}
}
