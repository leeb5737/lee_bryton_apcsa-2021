//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	
	//Constructors
	public Block(){
		this(100,100,10,10,Color.blue);
	}
	public Block(int x, int y) {
		this(x,y,10,10,Color.blue);
	}
	public Block(int x, int y, int wide) {
		this(x,y,wide,10,Color.blue);
	}
	public Block(int x, int y, int wide, int hei) {
		this(x,y,wide,hei,Color.blue);
	}
	public Block(int x, int y, int wide, int hei, Color c) {
		setall(x,y,wide,hei,c);
	}
	public void setall(int x, int y, int wide, int hei, Color c) {
		setPos(x,y);
		setWidth(wide);
		setHeight(hei);
		setColor(c);
	}
	
	//Setters
    public void setPos( int x, int y) {
    	setX(x);
    	setY(y);
    }
    public void setX( int x ) {
    	xPos = x;
    }
    public void setY( int y ) {
    	yPos = y;
    }
    public void setWidth(int wide) {
    	width = wide;
    }
    public void setHeight(int hei) {
    	height = hei;
    }
    public void setColor(Color c) {
    	color = c;
    }

	

   public void draw(Graphics window)
   {
      window.setColor(getColor());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	      window.setColor(col);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block a = (Block) obj;
		if (xPos == a.getX() && yPos == a.getY()
				&& width == a.getWidth() && height == a.getHeight()
				&& color.getRGB() == a.getColor().getRGB()) {
			return true;
		}
		return false;
	}   

   //Variable Return Methods
    public int getX() {
    	return xPos;
    }
    public int getY() {
    	return yPos;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public Color getColor() {
    	return color;
    }

   //toString() method  - x , y , width, height, color
   public String toString() {
	   return "" + xPos + "," + yPos + "," + width + "," + height + "," + color.toString();
   }
}