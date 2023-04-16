package JavaSE8;
interface fun
{
	String show(String company);
}
class FunctionalInterface
{
	public static void main(String[] args)
	{
		fun msg=(String company)->{System.out.println(company);
		return company;};
		msg.show("Mindtree");
	}
}