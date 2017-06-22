package model;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sprite {
	private Image image;
	
	private boolean imageLoaded;
	
	private String imageName;
	
	public void getMapChar(String ImageName) throws FileNotFoundException{
		FileInputStream fis = null;
		 fis = new FileInputStream(new File("C:\\Users\\MBOW\\Desktop\\Projet_Java\\a.txt"));
		
	}
}
