import javax.swing.JOptionPane;
import images.APImage;
import images.Pixel;

public class project55 {

	public static void main (String[]args){
		APImage image = new APImage("");
		image.draw();
		String inputStr = JOptionPane.showInputDialog(" Subtraction or adding Red value", "10");
	      if (inputStr == null) return;
	      int red = Integer.parseInt(inputStr);
	      inputStr = JOptionPane.showInputDialog(" Subtraction or adding Green value", "10");
	      if (inputStr == null) return;
	      int green = Integer.parseInt(inputStr);
	      inputStr = JOptionPane.showInputDialog(" Subtraction or adding Green value", "10");
	      if (inputStr == null) return;
	      int blue = Integer.parseInt(inputStr);
		      for (Pixel p : image){
		    	  int redo = p.getRed()+red;
		    	  int greeno = p.getGreen()+green;
		    	  int blueo = p.getBlue()+blue;
			         if (redo < 0){
			            p.setRed(0);
			         }else if(redo > 255){
			            p.setRed(255);
			         }   
			         if (greeno < 0){
			        	 p.setGreen(0);
			         }else if(greeno > 255){
				            p.setGreen(255);
			         }
			         if (blueo < 0){
			        	 p.setBlue(0);
			         }else if(blueo > 255){
				            p.setBlue(255);
			         }
		    	  p.setRed(redo);
		    	  p.setGreen(greeno);
		    	  p.setBlue(blueo);
	 
		    	  
		      }//end of Pixel loop
	      image.draw();
		
	}// End of Main
	
}//end of project
