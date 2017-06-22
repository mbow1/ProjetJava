package model;

import java.awt.Point;

public class PingPing extends Mobile {
	private Point position;
	private boolean alive = true;
	private Direction direction;

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public boolean getisAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public PingPing(boolean alive, Point position, Direction direction) {
		super(true, position,direction);
	}
	
	Sprite PingPing= new Sprite('e',"repertoire");
	
}
