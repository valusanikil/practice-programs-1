package javaTrack;

public class A {
	int age;
	String name;

	A() {
		System.out.println("Constructor of class A");
	}


	void AMethod() {
		System.out.println("Method of class A");
	}

	public static void main(String[] args) {
		A obj_A=new A();
		B obj_B=new B();
		obj_A.AMethod();
		obj_B.BMethod();
	}

}

class B {
	B() {
		System.out.println("Constructor of class B");
	}

	void BMethod() {
		System.out.println("Method of class B");
	}
}
