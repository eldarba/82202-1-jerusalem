package d.access.modifiers.b;

import d.access.modifiers.a.A;

public class D extends A {

	@Override
	public void m() {
		System.out.println(this.nPublic);
		System.out.println(this.nProtected);
//		System.out.println(this.nDefault);
//		System.out.println(this.nPrivate);
	}
}
