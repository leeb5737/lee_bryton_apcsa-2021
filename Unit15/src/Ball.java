//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	//Constructors
	public Ball()
	{
		super(200,200);
		setSpeed(3,1);
	}
	public Ball(int x, int y)
	{
		super(x,y);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int width) {
		super(x,y,width);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width, int height, int xSped, int ySped) {
		super(x,y,width,height);
		setSpeed(xSped,ySped);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		setSpeed(3,1);
	}	
	public Ball(int x, int y, int width, int height, Color color, int xSped, int ySped) {
		super(x,y,width,height,color);
		setSpeed(xSped,ySped);
	}

	
  
   //Setters
	public void setSpeed(int xSped, int ySped) {
		setXSpeed(xSped);
		setYSpeed(ySped);
	}
    public void setXSpeed( int xSped ) {
    	xSpeed = xSped;
    }
    public void setYSpeed( int ySped ) {
    	ySpeed = ySped;
    }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setX(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball a = (Ball) obj;
		if (super.equals(obj) && xSpeed == a.getXSpeed() && ySpeed == a.getYSpeed())return true;
		return false;
	}   

   //Variable Return Method
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	
   //toString() method
	public String toString() {
		 return getX() + "," + getY() + "," +  getWidth() + ","  + getHeight() + "," + getColor().toString() + "," 
				 + xSpeed + "," + ySpeed;
	}
}