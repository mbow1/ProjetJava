package model;

public class MyCharactere {
	  /** The Constant SPRITE. */
    private static final Sprite sprite          = new Sprite('c', "$_35.jpg");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteTurnLeft  = new Sprite('c', "MyVehicleLeft.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteTurnRight = new Sprite('c', "MyVehicleRight.png");

    /** The Constant spriteExplode. */
    private static final Sprite spriteExplode   = new Sprite('c', "MyVehicleExplode.png");
    
    private static final Sprite spriteUp = new Sprite ('c',"MyVehicleExplode.png");
    public MyVehicle(final int x, final int y, final IMap map) throws IOException {
        super(x, y, sprite, road, Permeability.BLOCKING);
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteExplode.loadImage();
    }
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnRight);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
     */
    @Override
    protected final void die() {
        super.die();
        this.setSprite(spriteExplode);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
     */
    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(sprite);
    }
}


}
