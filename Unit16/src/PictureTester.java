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
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.zeroRed();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    beach.zeroGreen();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    beach.zeroRed();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("wall.jpg");
    //beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
    //beach.explore();
    beach.modcol();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("Berserk.jpg");
    //caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }  
  public static void testmirrorVerticalRightToLeft()
  {
	    Picture caterpillar = new Picture("Berserk.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorVerticalRL();
	    caterpillar.explore();
  }
  public static void   testmirrorHorizontal()
  {
	    Picture caterpillar = new Picture("Berserk.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
  }
  public static void testmirrorHorizontalBotToTop()
  {
	    Picture caterpillar = new Picture("Berserk.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorHorizontalBT();
	    caterpillar.explore();
  }
  public static void testMirrorDiagonal()
  {
	    Picture caterpillar = new Picture("Berserk.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorDiag();
	    caterpillar.explore();
}
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    //temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void  testMirrorArms() {
	Picture temple = new Picture("snowman.jpg");
	//temple.explore();
	temple.mirrorArm();
	temple.explore();  
  }
  public static void testMirrorGull() {
		Picture temple = new Picture("seagull.jpg");
		temple.explore();
		temple.mirrorGull();
		temple.explore(); 
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
    Picture canvas2 = new Picture("640x480.jpg");
    canvas2.createCollage2();
    canvas2.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testChromakey()
  {
    Picture mark = new Picture("blue-mark.jpg");
    Picture moon = new Picture("moon-surface.jpg");
    mark.explore();
    mark.chromakey(moon);
    mark.explore();
  }
  public static void testBlur(int x, int y, int w, int h, int n)
  {
     Picture redMoto = new Picture("redMotorcycle.jpg");
     redMoto.explore();
     for (int i = 0; i<n; i++){
        redMoto.blur(x,y,w,h);
      }
      redMoto.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testmirrorVerticalRightToLeft();
	//testmirrorHorizontal();
	//testmirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();;
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testBlur(180,160,25,25,10); 
  }
}