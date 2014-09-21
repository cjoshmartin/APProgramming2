import javax.swing.*;

import java.awt.*;

public class Illusion extends JPanel{

	public Illusion(Color color){
	      setBackground(color);
	   }
	public void paintComponent (Graphics g){
	      super.paintComponent(g);
	      // the lines on the x-axis  
	      g.drawLine(20, 50,150, 50 );
	      g.drawLine(20, 20,150, 20);
	      
	      // the lines on the y-axis
	      g.drawLine(150, 50,170, 65 );
	      g.drawLine(150, 50,170, 40 );
	     
	      g.drawLine(10,60,20,50 );
	      g.drawLine(10,40, 20,50 );
	      
	      g.drawLine(20,20,30,30 );
	      g.drawLine(30,10, 20,20 );
	      
	      g.drawLine(140,10,150,20);
	      g.drawLine(150,20,140,30 );
	}
}

	      
	      