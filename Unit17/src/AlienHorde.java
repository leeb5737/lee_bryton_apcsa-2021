//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int loc = 0;
	private int loch = 0;
	int dist = 50;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(loc, loch, 10, 10, 1));
			if (loc > 800) {
				dist = -50;
				loch += 15;
			}
			else if (loc < 0) {
				dist = 50;
			}
			loc += dist;
		}
	}
	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens)
		{
			al.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien al : aliens) {
			if (al.getSpeed() > 0 && al.getX() > 800 - (2 * al.getWidth() + al.getSpeed())) {
				al.setSpeed(-al.getSpeed());
				al.setY(al.getY() + al.getHeight());
			}
			else if (al.getSpeed() < 0 && al.getX() < al.getWidth() + al.getSpeed()) {
				al.setSpeed(-al.getSpeed());
				al.setY(al.getY() + al.getHeight());
			}
			al.move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < aliens.size(); i++) {
			for (int j = 0; j < shots.size(); j++) {
				int minX = aliens.get(i).getX();
				int maxX = (aliens.get(i).getX() + aliens.get(i).getWidth());
				int minY = aliens.get(i).getY();
				int maxY = (aliens.get(i).getY() + aliens.get(i).getHeight());
				int sx = shots.get(j).getX();
				int sy = shots.get(j).getY();
				if ((sx > minX && sx < maxX) && (sy > minY && sy < maxY)) {
					shots.remove(j);
					aliens.remove(i);
					i--;
					if (i < 0) break;
					j--;
				}
				
			}
		}
	}
	
	public boolean hit (Ship s) {
		int minSx = s.getX();
		int maxSx = s.getX() + s.getWidth();
		int minSy = s.getY();
		int maxSy = s.getY() + s.getHeight();
		
		for (Alien al : aliens) {
			int minAx = al.getX();
			int maxAx = al.getX() + al.getWidth();
			int minAy = al.getY();
			int maxAy = al.getY() + al.getHeight();
			if ((minSx <= maxAx && maxSx >= minAx) && (minSy <= maxAy && maxSy >= minAy)){
				return true;
			}
		}
		return false;
	}
	public boolean anyleft() {
		if (aliens.size() == 0) return false;
		return true;
	}

	public String toString()
	{
		return "";
	}
}
