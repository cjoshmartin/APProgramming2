// Project 6-6 (parton)
public class Parton {

	private String name;
	private Book book1,book2,book3;
	
	
	public Parton(String n){
		name =n;
	}// end of method
	
	public boolean hasBorrowed(Book b)
	{
		if (b.getTitle().equals(book1.getTitle()) || b.getTitle().equals(book2.getTitle()) || b.getTitle().equals(book3.getTitle()))
		{
			return true;
		}
		else
		{
			return false;
		}
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
	}// end of return borrow
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
	}//end of borrow
	
	
	public String toString(){
	
	String str = name;
	if (book1 != null)
		str += "\n" + book1;
	else if (book2 != null)
		str += "\n" + book2;
	else if (book3 != null)
		str += "\n" + book3;
	
	return str;
	}//end of toString 
	
}// end of the Parton class
