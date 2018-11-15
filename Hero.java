
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.807;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        
        Actor diamand = getOneIntersectingObject(Diamand.class);
        {
            if(diamand != null)
            {
                getWorld().removeObject(diamand);
            }
        }
    }
    public void handleInput() 
    {
        if (Greenfoot.isKeyDown("w")&&(onGround()==true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
        }
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/ 2, Tile.class);
        return under != null;
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }    
}
