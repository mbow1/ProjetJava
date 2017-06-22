//Package à importer afin d'utiliser l'objet File
package view;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Storage extends JPanel {
	
	  public void paintComponent(Graphics g){
		    try {
		      Image img = ImageIO.read(new File("C:\\Users\\dylan\\Downloads\\Sprites\\SpriteCharacter\\74336_01.png"));
		      Image img1 = ImageIO.read(new File("C:\\Users\\dylan\\Downloads\\Sprites\\SpriteCharacter\\74336_02.png"));
		      g.drawImage(img, 100, 0, this);
		      g.drawImage(img1, 200, 200, this);
		      //Pour une image de fond
		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }                
		   

	  /**
	   * read the file of map 4
	   */
	  try{
		  InputStream flux=new FileInputStream("LVL4.txt"); 
		  InputStreamReader lecture=new InputStreamReader(flux);
		  BufferedReader buff=new BufferedReader(lecture);
		  String ligne;
		  while ((ligne=buff.readLine())!=null){
		  	System.out.println(ligne);
		  }
		  buff.close(); 
		  }		
		  catch (Exception e){
		  System.out.println(e.toString());
		  }
	  //# = les murs incassables
	  // o = les murs cassables
	  //e= les ennemies
	  // d= diamant
	  // b = rocher qui peuvent tomber
	

  }
}