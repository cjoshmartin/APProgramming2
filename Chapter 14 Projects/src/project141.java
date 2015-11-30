
//Project 14-1
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JOptionPane;
public class project141 {

	public static void main(String[] args) throws FileNotFoundException {
			String inputstr = JOptionPane.showInputDialog("enter file name(include file type like .txt)","number.txt");	
		
		
		Scanner file = new Scanner(new File(inputstr));
	
		List<String> lst = new ArrayList<String>();
		
		while (file.hasNext())
		{
			lst.add((file.next()).toUpperCase());	
		}
		
		
		
		String outputstr = JOptionPane.showInputDialog("enter file name for output (include file type like .txt)","number.txt");	
		 PrintWriter writer = new PrintWriter(new File(outputstr));
		for (int i = 0; i < lst.size(); i++)
			writer.println(lst.get(i));
			
		
		
	}// end of main 

}// end of project 14-1
