
//Name -Josh Martin	
//Date -
//Class -AP Computer Science
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WinterScenePanel extends JPanel implements Runnable
{
	private AbstractShape[] shapes; 	
	private AbstractShape sMan;

	public WinterScenePanel()
	{
		setVisible(true);
		
		//instantiate the array to hold 50 AbstractShape references
		shapes = new AbstractShape[50];
		
		//populate the array with 50 unique snowflakes
		Random math = new Random();
		for ( int i= 0; i<shapes.length; i++)
		{
			int x = math.nextInt(800);
			shapes[i] = new FancySnowFlake(x,10,10,10);
				
		}
		
		//instantiate a snowman
		sMan = new SnowMan(20, 20, 40, 50);
		
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);	
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);
		sMan.draw(window);
		
		//make the snowflakes appear and move down the screen
		for(int i = 0; i < 50; i++) 

		{ 

		shapes[i].moveAndDraw(window);

		if (shapes[i].getYPos() > getHeight()) 

		{ 
			shapes[i].setYPos(0);
		} 

		}
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            	   repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}