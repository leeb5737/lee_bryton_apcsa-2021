//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   
   //Constructors 
   public Paddle()
   {
	  super(10,10);
	   setSpeed(5);
   }
   public Paddle(int x, int y) {
	   super(x,y);
	   setSpeed(5);
   }
   public Paddle(int x, int y, int inSpeed) {
	   super(x,y);
	   setSpeed(inSpeed);
   }
   public Paddle(int x, int y, int wide, int height) {
	   super(x,y,wide,height);
	   setSpeed(5);
   }
   public Paddle(int x, int y, int wide, int height, int inSpeed) {
	   super(x,y,wide,height);
	   setSpeed(inSpeed);
   }
   public Paddle(int x, int y, int wide, int height, Color c) {
	   super(x,y,wide,height,c);
	   setSpeed(5);
   }
   public Paddle(int x, int y, int wide, int height, Color c, int inSpeed) {
	   super(x,y,wide,height,c);
	   setSpeed(inSpeed);
   }
   //Setter
   public void setSpeed(int inSpeed) {
	   speed = inSpeed;
   }
   
   //New Methods
   public void moveUpAndDraw(Graphics window)
   {
	   setY(getY()+getSpeed());

   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY()-getSpeed());

   }

   //Variable Return Methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return getX() + "," + getY() + "," +  getWidth() + ","  + getHeight() + "," + getColor().toString() + "," + getSpeed();
   }
}