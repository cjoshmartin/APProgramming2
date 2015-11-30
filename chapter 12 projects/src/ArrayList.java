
//project 12-1 - 12-3

public class ArrayList {

	private int logsize; 
	private Object list[];
	
	//constructors
	public ArrayList(){
		 list = new Object[5];
		logsize = 0;
	}
	public ArrayList(int a){
		list = new Object[a];
		logsize = 0;
	}
	
	public ArrayList(Object a[]){
		list = new Object[a.length];
		for(int i=0; i <a.length; i++)
		{
			if(a[i]!=null)
			{
				list[i]=a[i];
				logsize++;
			}
			
		}
	}
	
	
	//methods

	public int size(){
		return logsize;
		
	}

	
	public Object get(int a){
		
		if (a< 0 || a> logsize)
			throw new IndexOutOfBoundsException("Number is out of range");;
		
		return list[a];
		
	}
	
	public Object remove(int pos){
			
			if (pos < 0 || pos >= logsize)
				throw new IndexOutOfBoundsException("Number is out of range");;
				
				
			Object temp =list[pos];
			for (int i = pos; i < logsize-1; i++)
					list[i] = list[i+1];
			logsize--;
			return temp;
			
		}

	public boolean add(int pos, Object a)
	{
		if (logsize == list.length)
			return false;
		
		if (pos < 0){
			for (int i = logsize; i > 0; i--)
				list[i] =list[i-1];
			list[0]=a;
			return true;
		}// end of if
		
		if (pos >= logsize){
			list[logsize +1] = a;
			return true;}
		
		if (logsize < list.length)
			return true;
		
		return false;
		
	}
	
	public String Tostring(){
		String Str= null;
		if (logsize > 0){
			for(int i=0; i <logsize;i++)
				Str += list[i]+ " ";
			return Str;
		}
		else
			return "this String is empty";
	}


}
