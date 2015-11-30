import images.APImage;
import images.Pixel;

public class Project57 {
	public static void main (String[]args){
		
		APImage image = new APImage();
		int height = image.getHeight();
		int width = image.getWidth();
		image.draw();
			for (int y = 1; y < height; y++){
				for (int x = 1; x < width; x++)
				{
					Pixel orgPixel = image.getPixel(x,y);
					Pixel rightPixel = image.getPixel(x+1,y);
					Pixel leftPixel = image.getPixel(x-1,y);
					Pixel bottomPixel = image.getPixel(x,y-1);
					Pixel topPixel = image.getPixel(x,y+1);
					
					int aveRed = (orgPixel.getRed()+ leftPixel.getRed()+ rightPixel.getRed() + topPixel.getRed()+ bottomPixel.getRed())/5;
					int aveGreen = (orgPixel.getGreen()+ leftPixel.getGreen()+ rightPixel.getGreen() + topPixel.getGreen()+ bottomPixel.getGreen())/5;
					int aveBlue = (orgPixel.getBlue()+ leftPixel.getBlue()+ rightPixel.getBlue() + topPixel.getBlue()+ bottomPixel.getBlue())/5;
					 
					Pixel newPix = image.getPixel(x, y);
					newPix.setGreen(aveGreen);
					newPix.setBlue(aveBlue);
					newPix.setRed(aveRed);
					
				}//End off width For Loop 

			}// End of height For loop
	
			image.draw();
			
	}//End of Public Void
	
}// End of Main
