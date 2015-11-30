import javax.swing.JOptionPane;

import images.APImage;
import images.Pixel;

import java.util.Random;

public class Project51 {
	public static void main(String[]args){

	String inputStr = JOptionPane.showInputDialog("What picture would you like to use? (please include file type)", "smokey.jpg");
	if (inputStr == null)
		return;
	APImage image = new APImage(inputStr);
	APImage TheCopy = image.clone();
	TheCopy.draw();
	Random gen = new Random();
	int red = gen.nextInt(256);
	int green = gen.nextInt(256);
	int blue = gen.nextInt(256);
	
	int red2 = gen.nextInt(256);
	int green2 = gen.nextInt(256);
	int blue2 = gen.nextInt(256);
	
	for (Pixel p : TheCopy){
		int PRed = p.getRed();
		int PGreen = p.getGreen();
		int PBlue = p.getBlue();
		int average = (PRed + PGreen +PBlue) / 3 ;
		if (average < 128 ) {
			p.setRed(red);
			p.setGreen(green);
			p.setBlue(blue);
		}
		else {
			p.setRed(red2);
			p.setGreen(green2);
			p.setBlue(blue2);

		}
	}
	
	TheCopy.draw();
}
	
}
