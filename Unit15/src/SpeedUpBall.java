//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed;
	private int ySpeed;
   public SpeedUpBall()
   {
	   super(100,100);
	   setXSpeed(1);
	   setYSpeed(1);
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);
	   setXSpeed(1);
	   setYSpeed(1);
   }


   public SpeedUpBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
	   setXSpeed(1);
	   setYSpeed(1);

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);

   }

   public void setXSpeed( int xSpd )
   {
	   xSpeed = xSpd;
   }

   public void setYSpeed( int ySpd )
   {
	   ySpeed = ySpd;
   }
}

