package JavaSE8;

public class Assignment4 {

	public static void main(String[] args) {
		String str1=" java program";
		StringBuilder sb=new StringBuilder(" java program");
		int length=str1.length();
		System.out.println(length);
		str1=str1.substring(2,5);
		System.out.println(str1);
		System.out.println(sb.length());
		String sbr=sb.substring(2,5);
		System.out.println(sbr);
	}

}
