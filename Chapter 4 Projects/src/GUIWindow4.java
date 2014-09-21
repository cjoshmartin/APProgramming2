import javax.swing.*;
import java.awt.*;

public class GUIWindow4 extends JFrame{

   public static void main (String[] args){
      GUIWindow4 theGUI = new GUIWindow4();
      theGUI.setSize(200, 150);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Center37 panel = new  Center37(Color.white);
      Container pane = theGUI.getContentPane();
      pane.add(panel);
      theGUI.setVisible(true);
   }
}

