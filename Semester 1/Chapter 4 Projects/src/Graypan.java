import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class Graypan extends JPanel {
	public Graypan(Color backColor){
		setBackground(backColor);
	}

	 public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 g.setColor(Color.gray);
		 g.fillRect(52, 55, 50, 50);
	 }
}
