
import images.APImage;
import images.Pixel;

public class project52 {
	public static void main(String[]args){
		APImage image = new APImage("smokey.jpg");
		image.draw();
		for (Pixel p : image){
			int PRed = p.getRed();
			int PGreen = p.getGreen();
			int PBlue = p.getBlue();
			int average = (int)((PRed*.587) + (PGreen*.299) +(PBlue*.114) ) / 3 ;
				p.setRed(average);
				p.setGreen(average);
				p.setBlue(average);
		}
		image.draw();
	}
}
