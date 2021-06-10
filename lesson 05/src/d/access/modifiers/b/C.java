package d.access.modifiers.b;

import d.access.modifiers.a.A;

public class C {

	public void m() {
		A a = new A();
		System.out.println(a.nPublic);
//		System.out.println(a.nProtected);
//		System.out.println(a.nDefault);
//		System.out.println(a.nPrivate);
	}

}
