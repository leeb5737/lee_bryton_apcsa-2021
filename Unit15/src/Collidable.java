
public interface Collidable {
	boolean didCollideLeft();
	boolean didCollideRight();
	boolean didCollideTop();
	boolean didCollideBottom();
	public boolean didCollidePaddle(Paddle a);
}
