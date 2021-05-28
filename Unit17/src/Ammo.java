//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;

	public Ammo()
	{
		this(0,0,3);
	}

	public Ammo(int x, int y)
	{
		this(x,y,3);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y,5,2);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
	   	window.fillRect(super.getX(), super.getY(), super.getHeight(), super.getWidth());
	}
	
	
	public void move( String direction )
	{
		if (direction.equals("UP")) setY(getY()-getSpeed());
	}

	public String toString()
	{
		return "";
	}
}
