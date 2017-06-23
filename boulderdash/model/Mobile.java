package model;

import java.awt.Point;

public class Mobile {
	private boolean Alive=true;
	private Point position;
	private Direction direction;
	/**
	 * 
	 * @author MBOW
	 * <h1>class Mobile <h1>
	 * The mother class of all the elements likely to move
	 */
	public Mobile(boolean alive, Point position, Direction direction) {
		// TODO Auto-generated constructor stub
		this.Alive = alive;
		/** 
		*to khow if a mibile element is alive or not
		**/
		this.position = position;
		/**
		 * position of this mobile element
		 */
		this.direction = direction;
		/**
		 * the direction of this mobile element
		 */
	}
	/**
	 * 
	 * this fonction allow to get know when the charactere is alive or note
	 */
	public void isDie(){
		this.Alive= false;
	}
	public void isAlive(){
		this.Alive= true;
	}
	/**
	 * this fonction allow to know the position
	 * @return position
	 */
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position){
		this.position.setLocation(position);
	}
	public void position(int x,int y){
		position.x = x;
		position.y = y;
	}
	
	/**
	 * this method allow to get/set the position in order to detailed
	 * 
	 * @return position
	 */
	public int getX(){
		return position.x;
	}
	public int getY(){
		return position.y;
	}
	
	/**
	 *  to fixe position element
	 * @param x
	 */
	public void setX(int x){
		this.position.x = x;
	}
	public void setY(int y){
		this.position.x = y;
	}
	/**
	 * this fonction allow to move a Mobile element in X and Y axe
	 * 
	 */
	public void moveUp(){
		this.position.x+=1;
	}
	public void moveDown(){
		this.position.x-=1;
	}
	public void moveLeft(){
		this.position.y-=1;
	}
	public void moveRigth(){
		this.position.y+=1;
	}
}

