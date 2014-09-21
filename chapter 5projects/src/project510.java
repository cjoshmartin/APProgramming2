import images.APImage;
import images.Pixel;

public class project510 {
	public static void main (String[]args){
		APImage image = new APImage("smokey.jpg");
		image.draw();
		int height = image.getHeight();
		int width = image.getWidth();
		int newWidth = height;
		int newHeight = width;
		int x2 = 0;
	    int Y2 = newHeight - 1;
		APImage secondImage = new APImage(newWidth, newHeight);
		for(int y = 0; y < height; y++){
		Y2 = newHeight - 1;
			for ( int x = 0; x < width; x++){
				Pixel newPixel = image.getPixel(x, y);
				secondImage.setPixel(x2, Y2, newPixel);
				Y2--;
			}// End of Nested For Loop
			x2++;
		}// outer For loop
	     secondImage.draw();
	}// End of Main
}// end of Project
