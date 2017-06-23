package view;

import javax.swing.JFrame;

public class WindowsNext  extends Storages {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args){
	  /**
	   * this is windows
	   */
    JFrame windows = new JFrame();
                
    windows.setTitle(" regarde");
    windows.setSize(500, 500);
    windows.setLocationRelativeTo(null);
    windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    windows.setContentPane(new Storages());
    
   
    windows.setVisible(true);
  }
  

   
       
}

  	