
import javax.swing.*;    

import java.awt.*;;       

public class project411{

   public static void main(String[] args){
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Checker Board");
      int rows = 8;
      int cols = 8;
      
      theGUI.setSize(cols * 50, rows * 50);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(rows, cols));
      int color = 1;
      for (int i = 1; i <= rows; i++){
    	  for (int a = 0; a <= cols; a++){
         if (color == 1 ){
        	 ///black
        	color = 0;
        	ColorPanel panel = new ColorPanel(Color.BLACK);
        	 pane.add(panel);
         }
         else {
        	 //red
        	 color = 1;
        	 ColorPanel panel = new ColorPanel(Color.RED);
        	 pane.add(panel);
         }
     
    	  }
      }
      theGUI.setVisible(true);
   }
}