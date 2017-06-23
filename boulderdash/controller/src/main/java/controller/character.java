package controller;
import java.sql.SQLException;
import java.util.List;
import model.IModel;
import view.IView;

public class character implements IController {
	
	/** Constant speed of MyCharacter. */
	public static final int speed = 350;
	
	/** The view. */
	public character view;
	
	/** The model. */ 
	public character model;
	
	/** The stack order. */
	public order stackOrder;
	
	/**
	 * Instantiates a new My Character controller.
	 * 
	 * @param view
	 * 				the view
	 * @param model 
	 * 				the model
	 *
	 */
	
	

	

	
	
	
	/**
	 * Gets the view
	 * @return the view
	 * 
	 */
	public character getView() {
		return view;
	}
	

	/**
	 * Sets the view.
	 * @param view
	 * 			the view to set
	 */
	public void setView(character view) {
		this.view = view;
	}

	
	/**
	 * Gets the model.
	 * @return the model
	 */
	public character getModel() {
		return model;
	}

	
	/**
	 * Sets the model.
	 * @param model
	 * 		the model to set
	 */
	public void setModel(character model) {
		this.model = model;
	}

	
	/**
	 * Gets the stack order
	 * @return the stack order
	 */
	public order getStackOrder() {
		return stackOrder;
	}

	
	/** 
	 * Sets the stack order
	 * @param stackOrder
	 * 			the new stack order
	 */
	public void setStackOrder(order stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	
	public void clearStackOrder() {
		
		
	}
	
	
	
	
	
	
}
