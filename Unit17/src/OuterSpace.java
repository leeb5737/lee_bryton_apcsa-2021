//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	//private Ammo s;
	private AlienHorde horde;
	private Bullets shots;
	private boolean[] keys;
	private boolean gameover;
	private BufferedImage back;
	private int speed = 3;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400,300,50,50,3);
		horde = new AlienHorde(50);
		shots = new Bullets();
		gameover = false;
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		shots.drawEmAll(graphToBack);
		horde.moveEmAll();
		shots.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		shots.cleanEmUp();
		//add code to move Ship, Alien, etc.
		if(keys[0] == true && ship.getX() >= 0)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true && ship.getX() <= (800 - (ship.getWidth() + ship.getSpeed())))
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true && ship.getY() >= 0)
		{
			ship.move("UP");
		}
		if(keys[3] == true && ship.getY() <= 600 - (ship.getHeight() + 5 * ship.getSpeed()))
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			shots.add(new Ammo(ship.getX() + ship.getWidth() / 2, ship.getY(), speed));
		}
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		if (horde.hit(ship) || gameover == true) {
			//gameover = true;
			//graphToBack.drawString("You Lose", 350, 300);
			System.out.println("You Lose");
	   		try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		}
		
		if (!horde.anyleft() && !gameover) {
			//graphToBack.drawString("You Win", 350, 300);
			System.out.println("You Win");
	   		try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}
	public void checkcol() {
		
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }catch(Exception e)
	      {
	      }

  	}
}

