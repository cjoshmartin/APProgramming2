
public class Parton {

	private String name;
	private Book book1,book2,book3;
	
	
	public Parton(String n){
		name =n;
	}
	public boolean returnborrow(Book b){
		if (b.getTitle().equals(book1.getTitle())) 

		{ 

		book1 = null; 

		return true; 

		} 

		else if (b.getTitle().equals(book2.getTitle())) 

		{ 

		book2 = null; 

		return true; 

		} 

		else if (b.getTitle().equals(book3.getTitle()))

		{ 

		book3 = null; 

		return true; 

		} 

		else 

		{ 

		return false; 

		}
	}
	public boolean borrow(Book b)
	{
		if(book1==null)
		{
			book1 = b;
			return true;
		}
		else if (book2==null)
		{
			book2 = b;
			return true;
		}
		else if (book3==null)
		{
			book3 = b;
			return true;
		}
		else{
			return false;
		}
	}
}