package JavaSE8;
interface inter
{
	
}
class Msg implements inter
{
	public void display()
	{
		System.out.println("Hello, Welcome!");
	}
}
public class MarkerInterface {

	public static void main(String[] args) {
		Msg m=new Msg();
		m.display();
	}

}
