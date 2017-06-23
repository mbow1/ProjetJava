package view;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Storages extends JPanel{
	

	private static final long serialVersionUID = 1L;
	/**
	 * {@link}
	 * this is the research on the file
	 * @Dykan
	 */
	public Storages()  {
		BufferedReader f = null;
		
		try {
		    f = new BufferedReader(new FileReader("LVL4.txt"));
		
		    String line;
		    int j = 0;
		    while(( line = f.readLine()) != null) {
		    	int i = 0;
		    	int k ;
		  
		    	for( k=0; k < line.length(); k++, i+=16) 
		    	{
		    			char c = line.charAt(k);
		    			String icon = "";
		    			switch(c){ 
		    			case 'd' : 
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Diamant.png");
		    			break;
		    			case  'e' :
		    			icon = (System.getProperty("user.dir")+"\\sprite\\ennemy.png");
		    			break; 
		    			case 'b': 
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Rock.png");
		    			break;
		    			case  'o': 
		    			icon = (System.getProperty("user.dir")+"\\sprite\\WallBreak.png");
		    			break ;
		    			case  '#' : 
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Wall.png");
		    			break;
		    			case 'a' :
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Mud.png");
			    		}
		    			JPanel panel = new JPanel();
		    			panel.setLayout(new FlowLayout());
		    		 	System.out.println("Condition : E"+c+icon);
		    			JLabel label = new JLabel("");
		    			label.setIcon(new ImageIcon(icon));
		    			panel.add(label);
		    			add(panel);
		    			// Prepare an Image object to be used by drawImage()
		    			
		    			Dimension size = label.getPreferredSize();
		    			label.setBounds(i, j, size.width*5, size.height*5);
		    		
			    			j += 16;
			    		}
		    } 
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    finally {
	         // On ferme nos flux de données dans un bloc finally pour s'assurer
	         // que ces instructions seront exécutées dans tous les cas même si
	         // une exception est levée !
	         try {
	            if (f != null)
	               f.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }

	    }
		
		
	}
	      
	
	
}