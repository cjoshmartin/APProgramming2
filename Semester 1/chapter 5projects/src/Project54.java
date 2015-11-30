
import images.APImage;
import images.Pixel;

public class Project54 {

		public static void main(String[]args){
		
			APImage image = new APImage("smokey.jpg");
			image.draw();
			for (Pixel p : image){
				int Red = p.getRed();
				int Blue = p.getBlue();
				int Green = p.getGreen();
				int mid = (Red + Blue + Green) / 3;
				p.setRed(mid);
				p.setBlue(mid);
				p.setGreen(mid);
					if (Red < 63) {
						Red = (int)(Red*1.15);
						Blue = (int)(Blue*0.9);
							}else if (Red < 192){
								Red = (int)(Red*1.15);
							
							Blue = (int)(Blue*0.85);
						}
						else {
							Red = Math.min((int)(Red*1.08), 255);
							Blue = (int)(Blue * 0.93);
						}
				p.setRed(Red);
				p.setBlue(Blue);
				p.setGreen(mid);
		}
			image.draw();
	}
}
