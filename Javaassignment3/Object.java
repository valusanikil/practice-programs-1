package Javaassignment3;

public class Object {

	public static void main(String[] args) {
		mobile m=new mobile();
		m.ram=8;
		m.display="Amoled";
		m.size=6.45f;
		m.model="A50s";
		m.company="Samsung";
		System.out.println(m.ram);
		System.out.println(m.display);
		System.out.println(m.size);
		System.out.println(m.model);
		System.out.println(m.company);
	}

}
class mobile
{
	int ram;
	String display;
	float size;
	String model;
	String company;
}
