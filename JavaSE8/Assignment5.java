package JavaSE8;
interface interf
{
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
}
class test implements interf
{
	int res;
	@Override
	public void add(int a,int b) {
		res=a+b;
		System.out.println("The addition is: "+res);
		//System.out.println(res);
	}

	@Override
	public void sub(int a,int b) {
		res=a-b;
		System.out.println("The substraction is: "+res);
		//System.out.println(res);
	}

	@Override
	public void mul(int a,int b) {
		res=a*b;
		System.out.println("The multiplication is: "+res);
	}
	
}
public class Assignment5 {
	public static void main(String[] args) {
		test t=new test();
		t.add(3,2);
		t.sub(3,2);
		t.mul(3,2);
		
	}

}
