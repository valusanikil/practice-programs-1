package JavaSE8;

public class assignment2 {

	public static void main(String[] args) {
		Student s1=new Student("Nikil",99);
		printDetails(s1);
		Student s2=new Student("Pranay",90);
		printDetails(s2);
		Student s3=new Student("Akhil",95);
		printDetails(s3);
		Student s4=new Student("Rohan",93);
		printDetails(s4);
	}
	public static void printDetails(Student student)
	{
		System.out.println(student.getName()+" bearing roll no "+student.id+
				" got "+student.getMarks()+" marks"+" and studying in "+student.collegeName);
		System.out.println();
	}
}
class Student
{
	String name;
	int marks;
	static int id;
	static String collegeName;
	static 
	{
		id=1000;
		collegeName="SR Engineering college";
	}
	public Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
		id++;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	
}
