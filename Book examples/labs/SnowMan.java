
//Name - Josh Martin
//Date -
//Class -
//Lab  -Snow Man

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {	window.setColor(Color.white);
	   window.fillOval(450,450,150,90);
	   window.fillOval(475,415,100,60);
	   window.fillOval(490,380,70,60);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}