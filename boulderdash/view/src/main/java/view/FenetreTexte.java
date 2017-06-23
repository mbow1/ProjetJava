package view;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreTexte extends JPanel{
	
               
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FenetreTexte(){
		BufferedReader f = null;
		try {
		    f = new BufferedReader(new FileReader("LVL4.txt"));
		    // f = new FileReader("MAPLVL4.txt");
		    String line;
		    int j = 0;
		    while(( f.readLine()) != null) {
		    	line = f.readLine();
		    	int i = 0;
		    	int k ;
		    	for( k=0; k<line.length(); k++, i+=16) 
		    	{
		    			char c = line.charAt(k);
		    			String icon = "";
		    			if(c == 'd') {
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Diamant.png");
		    			} else if(c == 'e') {
		    			icon = (System.getProperty("user.dir")+"\\sprite\\ennemy.png");
		    			} else if(c == 'b') {
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Rock.png");
		    			} else if(c == 'o') {
		    			icon = (System.getProperty("user.dir")+"\\sprite\\WallBreak.png");
		    			} else if(c == '#') {
		    			icon = (System.getProperty("user.dir")+"\\sprite\\Wall.png");
		    			}
		    			JPanel panel = new JPanel();
		    			panel.setLayout(new FlowLayout());

		    			JLabel label = new JLabel("");
		    			label.setIcon(new ImageIcon(icon));
		    			panel.add(label);
		    			Dimension size = label.getPreferredSize();
		    			label.setBounds(i, j, size.width, size.height);
			    		}
			    			j += 16;
			    		}
		    } catch (IOException e) {
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
		JFrame f1 = new JFrame("Titre");
		f1.getIconImages();
		f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f1.setVisible(true);
	
	}
	
}