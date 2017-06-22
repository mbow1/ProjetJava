package model;

import java.awt.Point;

public class Mobile {
	private boolean Alive=true;
	private Point position;
	/**
	 * @return boolean
	 * @author MBOW
	 * <h1>class Mobile <h1>
	 * The mother class of all the elements likely to move
	 */
	public void isDie(){
		this.Alive= false;
	}
	public void isAlive(){
		this.Alive= true;
	}
	
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
	public int getX(){
		return position.x;
	}
	public int getY(){
		return position.y;
	}
	public void setX(int x){
		this.position.x = x;
	}
	public void setY(int y){
		this.position.x = y;
	}
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

