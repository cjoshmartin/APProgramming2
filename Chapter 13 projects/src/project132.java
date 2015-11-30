
public class project132 {
	private static String s ="";

	public static String backwards(String Str,int pos){
		
		if (Str.length()< pos)
			return	null;
		s = s+ Str.charAt(Str.length()- s.length() -1);
		backwards(Str, pos +1);
		return Str.substring(0, Str.length() -s.length()) + s;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(backwards("hello", 3));
	}

}
