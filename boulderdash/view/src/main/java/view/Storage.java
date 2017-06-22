//Package à importer afin d'utiliser l'objet File
package view;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Storage {
  public static void main(String[] args) {
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
    }		
  }