import images.APImage;
import images.Pixel;
import javax.swing.JOptionPane;

public class project58 {
	public static void main (String[]args){
		APImage image = new APImage("smokey.jpg");
		image.draw();
		String inputStr = JOptionPane.showInputDialog("reduction value", "2");
	      if (inputStr == null) return;
	      int size = Integer.parseInt(inputStr);
	      int width = image.getWidth();
	      int height = image.getHeight();
	      int newWidth = width / size;
	      int newHeight = height / size;
	      int x2 = 0;
	      int Y2 = 0;
	      APImage secondImage = new APImage(newWidth, newHeight);
	      for(int y = 0; y < height - size; y += size){
	    	  x2 = 0;
				for ( int x = 0; x < width - size; x += size){
					Pixel newPixel = image.getPixel(x, y);
					secondImage.setPixel(x2, Y2, newPixel);
					x2++;
				}// End of inner For loop
				Y2++;
	      }// End of Outer for loop
	      secondImage.draw();
		}// End of Main
}// End of Project 
