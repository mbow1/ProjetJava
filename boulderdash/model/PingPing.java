package model;

import java.awt.Point;

public class PingPing extends Mobile {
	/**
	 * <h1> PingPing<h1>
	 * 
	 */
	private Point position;
	private boolean alive = true;
	private Direction direction;

	public Point getPosition() {
		return position;
	}
	/**
	 * to fixe 
	 */
	public void setPosition(Point position) {
		this.position = position;
	}
	/**
	 * 
	 * @return  alive
	 */
	public boolean getisAlive() {
		return alive;
	}
	/**
	 * 
	 * @param alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	/**
	 * 
	 * @return direction
	 */
	public Direction getDirection() {
		return direction;
	}
	/**
	 * 
	 * @param direction
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	/**
	 * 
	 * @param alive
	 * @param position
	 * @param direction
	 */
	public PingPing(boolean alive, Point position, Direction direction) {
		super(true, position,direction);
	}
	
	//Sprite PingPing= new Sprite('e',"repertoire");
	
}
