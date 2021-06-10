package d.access.modifiers.a;

public class B {

	public void m() {
		A a = new A();
		System.out.println(a.nPublic);
		System.out.println(a.nProtected);
		System.out.println(a.nDefault);
//		System.out.println(a.nPrivate);
	}
}
