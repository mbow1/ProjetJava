package view;

import javax.swing.JFrame;

public class WindowsNext {
  public static void main(String[] args){

    JFrame fenetre = new JFrame();
                
    fenetre.setTitle("Mort connard regarde");
    fenetre.setSize(500, 500);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setContentPane(new Storage());
    fenetre.setVisible(true);
  }       
}