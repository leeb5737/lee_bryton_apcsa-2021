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

public class Pong extends Canvas implements KeyListener, Runnable
{
	//private Ball ball;
	//private SpeedUpBall ball;
	private BlinkyBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int p1score = 0;
	private int p2score = 0;

	public Pong()
	{
		//set up all variables related to the game
		//ball = new Ball(200,200,10,10,Color.red,3,1);
		//ball = new SpeedUpBall(200,200,10,10,Color.red,1,1);
		ball = new BlinkyBall(200,200,10,10,Color.red,3,1);
		leftPaddle = new Paddle(20,300,10,60,Color.blue,5);
		rightPaddle = new Paddle(750,300,10,60,Color.blue,5);
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	public void round() {
		//ball = new Ball(200,200,10,10,Color.red,3,1);
		//ball = new SpeedUpBall(200,200,10,10,Color.red,1,1);
		ball = new BlinkyBall(200,200,10,10,Color.red,3,1);
		leftPaddle = new Paddle(20,300,10,60,Color.blue,5);
		rightPaddle = new Paddle(750,300,10,60,Color.blue,5);
	}
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		 back = (BufferedImage)(createImage(getWidth(),getHeight()));
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.drawString("P1 Score" + p1score, 10, 10);
		graphToBack.drawString("P2 Score" + p2score, 700, 10);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<= super.getWidth()-10))
		{
			if(ball.didCollideLeft()) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				System.out.print("Left Lost");
				p2score++;
				round();
				
			}
			if(ball.didCollideRight()) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				System.out.print("Right Lost");
				p1score++;
				round();
			}
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideBottom() || ball.didCollideTop()) {
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if(ball.didCollidePaddle(leftPaddle) || ball.didCollidePaddle(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		/*if (ball.SpeedUp() ) {
			if (ball.getXSpeed()>0) ball.setXSpeed(ball.getXSpeed()+1);
			else ball.setXSpeed(ball.getXSpeed()-1);
		}
		else if ( ball.didCollidePaddle(leftPaddle) || ball.didCollidePaddle(rightPaddle)){
			if (ball.getXSpeed()>0) ball.setXSpeed(ball.getXSpeed()+1);
			else ball.setXSpeed(ball.getXSpeed()-1);
		}*/
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(window);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}