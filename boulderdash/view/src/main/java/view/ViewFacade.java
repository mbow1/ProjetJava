package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import fr.exia.showboard.BoardFrame;


/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView , KeyListener,Runnable {

	  /** The Constant roadView. */
    private static final int roadView   = 10;

    /** The Constant squareSize. */
    private static final int squareSize = 50;

    /** The Constant closeView. */
    private Rectangle        closeView;
    /**
     * Instantiates a new view facade.
     */
   /* public ViewFacade() {
        super();
    }*/
    /** The view. */
    private int              view;

    /** The order performer. */
    private IOrderPerformer  orderPerformer;

    
    
    /**
     * Instantiates a new insane vehicles View.
     *
     * @param road
     *            the road
     * @param myVehicle
     *            the my vehicle
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public ViewFacade(final IRoad road, final IMobile mycharac) throws IOException {
        this.setView(roadView);
        this.setRoad(road);
        this.setMycharac(mycharac);
        this.getMycharac().getSprite().loadImage();
        this.setCloseView(new Rectangle(0, this.getMycharac().getY(), this.getRoad().getWidth(), roadView));
        SwingUtilities.invokeLater(this);
    }
	  @Override
	    public final void run() {
	        final BoardFrame boardFrame = new BoardFrame("Close view");
	        boardFrame.setDimension(new Dimension(this.getRoad().getWidth(), this.getRoad().getHeight()));
	        boardFrame.setDisplayFrame(this.closeView);
	        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
	        boardFrame.setHeightLooped(true);
	        boardFrame.addKeyListener(this);
	        boardFrame.setFocusable(true);
	        boardFrame.setFocusTraversalKeysEnabled(false);

	        for (int x = 0; x < this.getRoad().getWidth(); x++) {
	            for (int y = 0; y < this.getRoad().getHeight(); y++) {
	                boardFrame.addSquare(this.road.getOnTheRoadXY(x, y), x, y);
	            }
	        }
	        boardFrame.addPawn(this.getMycharac());

	        this.getRoad().getObservable().addObserver(boardFrame.getObserver());
	        this.followMycharac();

	        boardFrame.setVisible(true);
	    }
    private static order keyCodeToUserOrder(final int keyCode) {
        order order;
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                order = order.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                order = order.LEFT;
                break;
            case KeyEvent.VK_DOWN :
            	order = order.DOWN;
            	break;
            case KeyEvent.VK_UP :
            	order = order.UP;
            default :
                order = order.NOP;
                break;
        }
        return order;
    }
    @Override
    public void keyTyped(final KeyEvent keyEvent) {
        // Nop
    }

    /**
     * utilisation de keyPressed
     */
    @Override
    public final void keyPressed(final KeyEvent keyEvent) {
        try {
            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
        } catch (final IOException exception) {
            exception.printStackTrace();
        }
    }
    


    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
   
    }
	@Override
	public void keyReleased(KeyEvent e) {
		// 
		
	}
	  @Override
	    public final void followMycharac() {
	        this.getCloseView().y = this.getMycharac().getY() - 1;
	    }


    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void setRoad(final IRoad road) throws IOException {
        this.road = road;
        for (int x = 0; x < this.getRoad().getWidth(); x++) {
            for (int y = 0; y < this.getRoad().getHeight(); y++) {
                this.getRoad().getOnTheRoadXY(x, y).getSprite().loadImage();
            }
        }
    }
    /**
     * Gets my charac.
     *
     * @return my charac
     */
    private IMobile getMycharac() {
        return this.mycharac;
    }

    /**
     * Sets my charac
     *
     * @param mycharac
     *            my new charac
     */
    private void setMycharac(final IMobile mycharac) {
        this.mycharac = mycharac;
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    private int getView() {
        return this.view;
    }

    /**
     * Sets the view.
     *
     * @param view
     *            the new view
     */
    private void setView(final int view) {
        this.view = view;
    }

    /**
     * Gets the close view.
     *
     * @return the close view
     */
    private Rectangle getCloseView() {
        return this.closeView;
    }

    /**
     * Sets the close view.
     *
     * @param closeView
     *            the new close view
     */
    private void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
    }

    /**
     * Gets the order performer.
     *
     * @return the order performer
     */
    private IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;
    }

    /**
     * Sets the order performer.
     *
     * @param orderPerformer
     *            the new order performer
     */
    public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    

}
