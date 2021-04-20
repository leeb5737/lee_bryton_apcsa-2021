//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class BlinkyBall extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	//Constructors
	public BlinkyBall()
	{
		super(200,200);
		setSpeed(3,1);
	}
	public BlinkyBall(int x, int y)
	{
		super(x,y);
		setSpeed(1,1);
	}
	public BlinkyBall(int x, int y, int width) {
		super(x,y,width);
		setSpeed(1,1);
	}
	
	public BlinkyBall(int x, int y, int width, int height) {
		super(x,y,width,height);
		setSpeed(1,1);
	}
	
	public BlinkyBall(int x, int y, int width, int height, int xSped, int ySped) {
		super(x,y,width,height);
		setSpeed(xSped,ySped);
	}
	
	public BlinkyBall(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		setSpeed(1,1);
	}	
	public BlinkyBall(int x, int y, int width, int height, Color color, int xSped, int ySped) {
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
	   super.setColor(new Color(random(),random(),random()));
	   draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   public int random() {
	   return (int) (Math.random() * 256);
   }
   
	public boolean equals(Object obj)
	{
		BlinkyBall a = (BlinkyBall) obj;
		if (super.equals(obj) && xSpeed == a.getXSpeed() && ySpeed == a.getYSpeed()) {
			return true;
		}
		return false;
	}   

   //Variable Return Method
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public boolean didCollideLeft() {
		if (super.getX() <= 10) return true;
		return false;
	}
	public boolean didCollideRight() {
		if (super.getX() >= 790) return true;
		return false;
	}
	public boolean didCollideTop() {
		if (super.getY() <= 50) return true;
		return false;
	}
	public boolean didCollideBottom() {
		if (super.getY() >= 550) return true;
		return false;
	}
	public boolean didCollidePaddle(Paddle a) {
		if ((super.getX() <= a.getX() + a.getWidth() && super.getX() >= a.getX())
				&& ((super.getY() <= a.getY() + a.getHeight() && super.getY() >= a.getY()))) return true;
			return false;
	}
	
   //toString() method
	public String toString() {
		return getX() + "," + getY() + "," + getWidth() + "," + getHeight() + "," + getColor().toString() + "," + xSpeed + "," + ySpeed;
	}
}