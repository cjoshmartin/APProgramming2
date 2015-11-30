
public class test {

	
	public static int searchArray (int[] a, int item)
	{
			    
		if(a[a.length/2]==item)
			return item;
		else if(a[a.length/2]<item)
			for(int j=a.length/2; j> 0; j--)
				if(a[j]==item)
					return item;
		else 
			for(int t=a.length/2; t<a.length; t++)
				if(a[t]==item)
					return item;
	}//end of class
	
	
	public static void main(String args[])
	 {
		
		
	 }
	
}
