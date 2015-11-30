
import javax.swing.*;

import java.awt.*;

public class Project413 {
   
	 public static void main(String[] args){
	      JFrame theGUI = new JFrame();
	      theGUI.setTitle("Project 4.13");
	      theGUI.setSize(300, 200);
	      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Graypan panel1 = new Graypan(Color.black);
	      Graypan panel2 = new Graypan(Color.white);
	      Container pane = theGUI.getContentPane();
	      pane.setLayout(new GridLayout(1, 2));
	      pane.add(panel1);
	      pane.add(panel2);
	      theGUI.setVisible(true);
   }
}