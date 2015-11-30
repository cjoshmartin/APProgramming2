
//Name -Josh Martin
//Date -
//Class -Ap Computer Science
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

//extend the AbstractShape class to make a FancySnowFlake class


public class FancySnowFlake extends AbstractShape
{
	
	 public FancySnowFlake(int x, int y, int w, int h )
	   {
			super(x, y, w, h, Color.WHITE, 0, 1);
	   }

	
	public void draw(Graphics window) {
		window.setColor(Color.white);
		window.drawOval(getXPos(),getYPos(),getWidth(),getHeight());
		
	}

	public void moveAndDraw(Graphics window) {
		
		Random r = new Random();
		
		setXPos(getXPos() +(getXSpeed()));
		setYPos(getYPos()+(getXSpeed()+r.nextInt(2)));
		draw(window);
		
		if (getXPos() > 800 + getWidth()){
			setXPos(0);
		draw(window);
		}
		if (getYPos() > 650)
		{	
			setYPos(0);
			setXPos(r.nextInt(850));
		}


		
	}
	
	
}