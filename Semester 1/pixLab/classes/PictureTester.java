/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("D:/Documents/APProgramming2/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("D:/Documents/APProgramming2/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("D:/Documents/APProgramming2/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("D:/Documents/APProgramming2/pixLab/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:/Users/joshmartin/Documents/APProgramming2/pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	    Picture caterpillar = new Picture("D:/Documents/APProgramming2/pixLab/images/caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
	  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
   // onlyBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
   // testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 // testmirrorHorizontal();
	 // testermirrorArms();
	  //testmirrorHorizontalBotToTop();
  }// end of main
  
  // Josh made methods
  
  public static void onlyBlue()
  {
    Picture beach = new Picture("D:/Documents/APProgramming2/pixLab/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testmirrorHorizontal()
  {
	  Picture beach = new Picture("C:/Users/joshmartin/Documents/APProgramming2/pixLab/images/redMotorcycle.jpg");
	    beach.mirrorHorizontal();
	    beach.explore();
	    
  }// end of test mirror
  
  public static void testmirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture("D:/Documents/APProgramming2/pixLab/images/redMotorcycle.jpg");
	    beach.mirrorHorizontalBotToTop();
	    beach.explore();
	    
  }// end of test mirror
  
  public static void testermirrorArms()
  {
	  Picture snowman = new Picture("C:/Users/joshmartin/Documents/APProgramming2/pixLab/images/snowman.jpg");
	  snowman.explore();
	 snowman.mirrorArms();
	  snowman.explore();
	    
  }
  public static void testMirrorGull()
  {
	  //Picture Gull = new Picture("C:/Users/joshmartin/Documents/APProgramming2/pixLab/images/snowman.jpg");
	  Picture Gull = new Picture("D:/Documents/APProgramming2/pixLab/images/seagull.jpg");
	  Gull.mirrorGull();
	  Gull.explore();
	    
  }
  
}// end of class