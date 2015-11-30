import javax.swing.*;

import java.awt.*;

public class Center37 extends JPanel {
	public Center37(Color color){
	      setBackground(color);
	   }
	public void paintComponent (Graphics g){
	      super.paintComponent(g);
	      int x = getWidth() / 2 -40;
	      int y = getHeight() / 2 ;
	      String centerofpage = "(" + x + " ," + y + ")";
	    // g.fillArc(x,y,50,50,0,360);
	     Font font = new Font("Courier", Font.BOLD, 14);
	      g.setFont(font);
	     g.drawString(centerofpage,x, y);
	}
}
	      