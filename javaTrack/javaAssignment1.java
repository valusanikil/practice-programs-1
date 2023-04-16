package javaTrack;
public class javaAssignment1 {
	public static void main(String[] args) {
		boolean w=true;
		boolean x=false;
		boolean y=true;
		boolean z=false;
		boolean result=x && y;
		System.out.println("x && y:\t"+result);
		result= x || y;
		System.out.println("x || y:\t"+result);
		result=!x;
		System.out.println("!x    :\t"+result);
		result= !y;
		System.out.println("!y    :\t"+result);
		result=y &&z;
		System.out.println("y && z:\t"+result);
		result=w && z;
		System.out.println("w && z:\t"+result);
		result=z||y;
		System.out.println("z || y:\t"+result);
		result=!z;
		System.out.println("!z    :\t"+result);
	}

}

