package view;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Windows extends JFrame {
	  /**
	 * <h1> Shows the principal Windows <h1>
	 * 
	 * @author MBOW
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	

	
	public Windows(int Taille){
		ImageIcon icon = new ImageIcon("C:/Users/MBOW/Desktop/Projet_Java/BoulderDash-BaseProject/BoulderDash/view/74336.png");
		
		int WIDTH = Taille;
		int HEIGHT = WIDTH/16*9;
		JLabel img = new JLabel(icon);

	    this.setTitle("BoulderDash");
	    this.setSize(WIDTH, HEIGHT);
	    this.setLocationRelativeTo(null);               
	 
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.BLACK);        
	    this.setContentPane(pan);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setResizable(false);
	    pan.add(img);
	  }
	  
	}