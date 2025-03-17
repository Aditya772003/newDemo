package inheritancetest;

public class Test1 {

	public static void main(String[] args) {
		B1 b=new C1();
		b.m4 ();
		b.m3();
		b.m5();
		b.m1();
		b.m2();
		System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.b);
	}

}
