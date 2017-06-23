package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Sprite {
	ImageIcon rock = new ImageIcon(System.getProperty("Sprites")+"74359_02.png");
	ImageIcon wall = new ImageIcon(System.getProperty("Sprites")+"74359_01.png");
	ImageIcon diamond = new ImageIcon(System.getProperty("Sprites")+"74359_05.png");
	ImageIcon floor = new ImageIcon(System.getProperty("Sprites")+"74359_03.png");
	ImageIcon monster = new ImageIcon(System.getProperty("Sprites")+"74359_10.png");




	scan = new Scanner(new File(System.getProperty("level")+"LVL 1.txt"));
	while (scan.hasNextLine()){
		for (char c : scan.next().toCharArray()){}
		if(c=='#'){
			sprite = scaleImage(74359_02, 30, 30);				
		}
		if(c=='d'){
			sprite = scaleImage(diamond.getImage(),30,30);
		}
		if(c=='a'){
			sprite = scaleImage(floor.getImage(),30,30);
		}
		if(c=='o'){
			sprite = scaleImage(rock.getImage(),30,30);
		}
		if(c=='e'){
			sprite = scaleImage(monster.getImage(),30,30);
		}

		g2d.drawImage(sprite,compt1,compt2,this);
		compt1=compt1+30;
		if(c=='/'){
			compt1=0;
			compt2=compt2+30;
		}
	
}
finally{
	if(scan /= null)
		scan.close();
}
catch (FileNotFindExecption e){
	e.printStackTrace();
}



public static Sprite scaleImage(Sprite source, int width, int height) {
	BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = (Graphics2D) img.getGraphics();
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.drawImage(source, 0, 0, width, height, null);
	g.dispose();
	return img;
}
}
}
