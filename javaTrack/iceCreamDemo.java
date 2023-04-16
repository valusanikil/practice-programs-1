package javaTrack;

public class iceCreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iceCream myIce=new iceCream("fallooda",50,2);
		iceCream yourIce=new iceCream("shikanji",80,1);
		myIce.addTopping("kaju");
		myIce.addTopping("Badam");
		yourIce.addTopping("cherries");
		printIceCream(myIce);
		printIceCream(yourIce);
	}
	public static void printIceCream(iceCream ice)
	{
		System.out.println(ice.getName()+" is "+ice.getCost()+" rupees "+ice.getNumScoops());
		System.out.print("topped with:");
		ice.printToppings();
		System.out.println();
	}

}
