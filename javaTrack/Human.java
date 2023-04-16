package javaTrack;

class Person {
	private String name;
	private String company;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	
	public String getCompany() {
		return this.company;
	}
	
}

public class Human {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Nikil");
		p1.setCompany("Mindtree");
		System.out.println(p1.getName()+" is working in "+p1.getCompany()+" company.");
		Person p2=new Person();
		p2.setName("Vakul");
		p2.setCompany("Applied Informatics");
		System.out.println(p2.getName()+" is working in "+p2.getCompany()+" company.");
		
		
	}

}
