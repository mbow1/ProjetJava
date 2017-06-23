package view;

import javax.swing.JFrame;

public class WindowsNext  extends FenetreTexte {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args){
	  /**
	   * this is windows
	   */
    JFrame fenetre = new JFrame();
                
    fenetre.setTitle("Mort connard regarde");
    fenetre.setSize(500, 500);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setContentPane(new FenetreTexte());
   
    fenetre.setVisible(true);
  }
  

   
       
}

  	