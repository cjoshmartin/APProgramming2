// Project 6-6 (book)
public class Book {

	private String author, title;
	
	public Book(){
	author ="";
	title ="";
		
		
	}
	
	public Book(String a, String b)
	{
		author = a;
		title = b;
		
	}
	
	public void SetAuthor (String A){
		
		author = A;
	}
	
	public void SetTitle (String A){
			
			title = A;
		}
	
	public String getAuthor() {
		return author;
		
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public String toString()
	{
		return author + " " + title;
	}
	
}// end of class
