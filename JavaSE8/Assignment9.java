package JavaSE8;

import java.util.Arrays;

public class Assignment9 {

	public static void main(String[] args) {
		MyDate[] dates= {new MyDate(4,21,1698),new MyDate(8,25,1969),new MyDate(10,26,1999)};
		Arrays.sort(dates);
		for(MyDate dt:dates)
		{
			System.out.println("day:"+dt.day+" month:"+dt.month+" year:"+dt.year);
		}
	}

}
class MyDate implements Comparable
{

	int day;
	int month;
	int year;
	public MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public int compareTo(Object o) {
		MyDate d=(MyDate) o;
		if(year!=d.year)
		{
			return year-d.year;
		}
		if(month!=d.month)
		{
			return month-d.month;
		}
		if(day!=d.day)
		{
			return day-d.day;
		}
		return 0;
	}
	
}
