import java.util.Scanner;

public class nestedLoopPcQuiz {
	
	public static void main(String args[])
	 {
		int size;
		String letter="";
		Scanner reader = new Scanner(System.in);
	
		System.out.println(" enter the size::");
		size =reader.nextInt();
		System.out.println(" enter the char::");
		letter =reader.next();
		System.out.println(letter);
		
		for( int c= 1; c <= size; c++ )
		{
			System.out.println(letter);
			for(int x=c; x <=size;x++)
				System.out.println(letter);
		}
	
	 }
}
