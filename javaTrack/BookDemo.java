package javaTrack;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book harryPotter=new Book("JK Rowling","Harry potter","Fantasy",500);
		Book lordOfTheRings=new Book("J.R.R Tolkein","Lord of the Rings","Fantasy",1000);
		Book gameOfThrones=new Book("George R.R Martin","Game of Thrones","Fantasy",1500);
		harryPotter.printBookDetails();
		lordOfTheRings.printBookDetails();
		gameOfThrones.printBookDetails();
	}
	
}
