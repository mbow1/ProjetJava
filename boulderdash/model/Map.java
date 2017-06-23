package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Map {
	/**
	 * <h1> the Map Class<h1>
	 * @author MBOW
	 * this class is a javaObject  that will be save in Database
	 */
	
	/**
	 * long is the width
	 * larg is the length
	 */
	private int Lon;
	private int Larg;
	private char[][] Map;
	
	/**
	 * is the constructore
	 * @param lon
	 * @param larg
	 */
	
	public Map(int lon,int larg){
		this.Lon = Lon;
		this.Larg = larg;
		this.getMap();
	}
	/**
	 * 
	 * @return the width
	 */
	public int getLon() {
		return Lon;
	}
	/**
	 * 
	 * @param the length
	 */
	public void setLon(int l) {
		Lon = l;
	}
	public int getLarg() {
		return Larg;
	}
	/**
	 * 
	 * @param larg
	 */
	public void setLarg(int larg) {
		Larg = larg;
	}
	/**
	 * 
	 * @return
	 */
	public char[][] getMap() {
		return Map;
	}
	/**
	 * 
	 * @param map
	 */
	public void setMap(char[][] map) {
		Map = map;
	}
	
	
}
