package JavaSE8;

import java.util.*;

public class Assignment8 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(5);
		hashSet.add(10);
		hashSet.add(8);
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(5);
		Iterator<Integer> iter=hashSet.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		

	}

}
