
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public static int diamanten;

    public Hero() {
        super();
        gravity = 9.807;
        acc = 0.6;
        drag = 0.9;
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
        for (Actor enemy : getIntersectingObjects(Water.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new MyWorld());
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Lava.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new MyWorld());
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Chain.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -15;
                }
            }
        }
        for (Actor enemy : getIntersectingObjects(RopeVertical.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -15;
                }
            }
        }
        for (Actor enemy : getIntersectingObjects(RopeAttached.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -15;
                }
            }
        }

        
        Actor diamand = getOneIntersectingObject(Diamand.class);
        {
            if(diamand != null)
            {
                World myWorld = getWorld();
                getWorld().removeObject(diamand);
                diamanten++;
                MyWorld world = getWorldOfType(MyWorld.class);
                if(world!= null) {
                    world.getScoreboard().addDiamanten();
                }
            }
        }
    }
    public void handleInput() 
    {
        if (Greenfoot.isKeyDown("w")&&(onGround()==true)) 
        {
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
        Tile tile = (Tile) under;
        if(tile!=null){
            if(tile.isSolid){
                return true;
            }
        }
        return false;
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }    
}
