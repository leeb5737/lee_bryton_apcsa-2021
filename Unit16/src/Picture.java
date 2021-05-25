import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void zeroRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);;
      }
    }
  }
  
  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);;
      }
    }
  }
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(pixelObj.getGreen()-255);
        pixelObj.setBlue(pixelObj.getBlue()-255);
        pixelObj.setRed(pixelObj.getRed()-255);
      }
    }
  }
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int average = pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed();
    	average/=3;
        pixelObj.setGreen(average);
        pixelObj.setBlue(average);
        pixelObj.setRed(average);
      }
    }
  }
  public void modcol()
  {
	int g = 0;
	int r = 0;
	int b = 0;
    Pixel[][] pixels = this.getPixels2D();
    int tpixels = pixels.length * pixels[0].length;
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	  g+= pixelObj.getGreen();
    	  b+= pixelObj.getBlue();
    	  r+= pixelObj.getRed();
      }
    }
    int gav = g/tpixels;
    int bav = b/tpixels;
    int rav = r/tpixels;
    for (Pixel[] rowArray : pixels)
    	{
    		for (Pixel pixelObj : rowArray)
    		{
    			pixelObj.setGreen(pixelObj.getGreen() + (200-gav));
    			pixelObj.setBlue(pixelObj.getBlue()+ (200-bav));
    			pixelObj.setRed(pixelObj.getRed() + (200-rav));
    		}
    	}
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorVerticalRL()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < width / 2; row++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[width - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontalBT() 
  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels.length;
	    for (int col = 0; col < pixels[0].length; col++)
	    {
	      for (int row = 0; row < width / 2; row++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[width - 1 - row][col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  }
  public void chromakey(Picture newp) 
  {
	    Pixel[][] toPixels = this.getPixels2D();
	    Pixel[][] fromPixels = newp.getPixels2D();
	    Pixel fromPixel = null;
	    Pixel toPixel = null;
	    for (int r = 0; r < this.getHeight();r++) {
	    	{
	    		for (int c = 0; c < this.getWidth();c++) {
	    			toPixel = toPixels[r][c];
	    			if (toPixel.getBlue() > toPixel.getRed()) {
	    				fromPixel = fromPixels[r][c];
	    				toPixel.setColor(fromPixel.getColor());
	    			}
	    		}
	    	}
	    }
  }
  
  public void mirrorDiag()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < row; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[col][row];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  public void mirrorArm() {
	  int mirrorPoint = 195;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
		    
		    // loop through the rows
	  for (int row = 162; row < mirrorPoint; row++)
	  	{
		      // loop from 13 to just before the mirror point
		  for (int col = 111; col < 297; col++)
		  	{
			  leftPixel = pixels[row][col];      
			  rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
					  [col];
			  rightPixel.setColor(leftPixel.getColor());
		  	}
	  	}
  }
  public void mirrorGull() {
	  {
		    int mirrorPoint = 240;
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int count = 0;
		    Pixel[][] pixels = this.getPixels2D();
		    
		    // loop through the rows
		    for (int row = 221; row < 335; row++)
		    {
		      // loop from 13 to just before the mirror point
		      for (int col = mirrorPoint; col < 342; col++)
		      {
		        count++;
		        leftPixel = pixels[row][col];      
		        rightPixel = pixels[row]                       
		                         [mirrorPoint - col + mirrorPoint];
		        rightPixel.setColor(leftPixel.getColor());
		      }
		    }
		    System.out.println(count);
		  }  
  }
 
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copy(Picture fromPic, 
          int tRow, int tCol , int sR, int sC, int eR, int eC)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = Math.min(sR, fromPixels.length), toRow = tRow; 
			  fromRow < Math.min(fromPixels.length, eR) && toRow < toPixels.length; fromRow++, toRow++){
		  for (int fromCol = Math.min(fromPixels.length, sC), toCol = tCol; 
				  fromCol < Math.min(fromPixels[0].length, eC) && toCol < toPixels[0].length; fromCol++, toCol++){
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }  
  public void createCollage2()
  {
	    Picture graf = new Picture("Graffiti.jpg");
	    Picture flower1 = new Picture("flower1.jpg");
	    Picture flower2 = new Picture("flower2.jpg");
	    this.copy(graf,0,0,0,0,50,50);
	    this.copy(flower2,100,0);
	    this.copy(flower1,200,0,0,0,50,50);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,0);
	    this.copy(graf,400,0,50,50,150,150);
	    this.copy(flower2,500,0);
	    this.mirrorVertical();
	    this.write("collage.jpg");
	  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void blur (int x, int y, int w, int h) {
	  System.out.println("Bryton L.; Period 3; 25 May 2021");
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel p1 = null;
	  Pixel p2 = null;
	  Pixel p3 = null;
	  Pixel p4 = null;
	  Pixel p5 = null;
	  Pixel p6 = null;
	  Pixel p7 = null;
	  Pixel p8 = null;
	  Pixel mid = null;
	  int avgreen = 0;
	  int avblue = 0;
	  int avred = 0;
	  for (int row = x; row < x+h; row++) {
		  for (int col = y; col < y + w; col++) {
			  if (row == 0 && col == 0) {
				  p1 = pixels[row][col];
				  p2 = pixels[row][col];
				  p3 = pixels[row][col+1];
				  p4 = pixels[row][col];
				  mid = pixels[row][col];
				  p5 = pixels[row][col+1];
				  p6 = pixels[row+1][col];
				  p7 = pixels[row+1][col];
				  p8 = pixels[row+1][col+1];
			  }
			  else if (row == 0) {
				  p1 = pixels[row][col-1];
				  p2 = pixels[row][col];
				  p3 = pixels[row][col+1];
				  p4 = pixels[row][col-1];
				  mid = pixels[row][col];
				  p5 = pixels[row][col+1];
				  p6 = pixels[row+1][col-1];
				  p7 = pixels[row+1][col];
				  p8 = pixels[row+1][col+1];
			  }
			  else if (col == 0) {
				  p1 = pixels[row-1][col];
				  p2 = pixels[row-1][col];
				  p3 = pixels[row-1][col+1];
				  p4 = pixels[row][col];
				  mid = pixels[row][col];
				  p5 = pixels[row][col+1];
				  p6 = pixels[row+1][col];
				  p7 = pixels[row+1][col];
				  p8 = pixels[row+1][col+1];
			  }
			  else {
				  p1 = pixels[row-1][col-1];
				  p2 = pixels[row-1][col];
				  p3 = pixels[row-1][col+1];
				  p4 = pixels[row][col-1];
				  mid = pixels[row][col];
				  p5 = pixels[row][col+1];
				  p6 = pixels[row+1][col-1];
				  p7 = pixels[row+1][col];
				  p8 = pixels[row+1][col+1];
			  }
			  avred = p1.getRed() + p2.getRed() + p3.getRed() + p4.getRed() + p5.getRed() 
			  				+ p6.getRed() + p7.getRed() + p8.getRed() + mid.getRed();
			  avblue = p1.getBlue() + p2.getBlue() + p3.getBlue() + p4.getBlue() + p5.getBlue() 
				+ p6.getBlue() + p7.getBlue() + p8.getBlue() + mid.getBlue();
			  avgreen = p1.getGreen() + p2.getGreen() + p3.getGreen() + p4.getGreen() + p5.getGreen() 
				+ p6.getGreen() + p7.getGreen() + p8.getGreen() + mid.getGreen();
			  avred = avred/9;
			  avgreen = avgreen/9;
			  avblue = avblue/9;
			  mid.setRed(avred);
			  mid.setGreen(avgreen);
			  mid.setBlue(avblue);
		  }
	  }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
