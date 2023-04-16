package javaTrack;

public class Book {
	private String author;
	private String title;
	private String genre;
	private int numPages;
	public Book(String author,String title,String genre,int numPages)
	{
		this.author=author;
		this.title=title;
		this.genre=genre;
		this.numPages=numPages;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
	public String getGenre()
	{
		return genre;
	}
	public int getNumPages()
	{
		return numPages;
	}
	public void printBookDetails()
	{
		System.out.println(title+" is written by "+author+" and "+genre
				+" has "+numPages+" pages.");
		System.out.println();
	}
}

