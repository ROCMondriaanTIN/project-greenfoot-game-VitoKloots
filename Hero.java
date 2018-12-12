
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
    public static int levens;
    public static int wereld;
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;

    public Hero() {
        super();
        gravity = 9.807;
        acc = 0.6;
        drag = 0.9;
        if(Speler1.HeroSelecter == 1)
        {
           setImage("p1.png");
        }
        if(Speler1.HeroSelecter == 2)
        {
           setImage("p2.png");
        }
        if(Speler1.HeroSelecter == 3)
        {
           setImage("p3.png");
        }
        
        for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p" + (Speler1.HeroSelecter) + "_walk" + (i+1) + ".png" );
        setImage( images[imageNumber] );
    }
    
    public void gaatDood(){
        levens--;
        Letter.teller = 0;
    }
    
     public void animation(){
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
    }
    @Override
    public void act() {
        handleInput();
        if(levens == 0)
        {
            setLocation(884, 1365); 
            Greenfoot.setWorld(new GameOver());
        }
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new MyWorld());
                gaatDood();
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Water.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new MyWorld());
                //getWorld(this).
                gaatDood();
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Lava.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new MyWorld());
                gaatDood();
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Chain.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -10;
                }
            }
        }
        for (Actor enemy : getIntersectingObjects(Ladder.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -10;
                }
            }
        }
        for (Actor enemy : getIntersectingObjects(RopeVertical.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -10;
                }
            }
        }
        for (Actor enemy : getIntersectingObjects(RopeAttached.class))
        {
            if (enemy != null) {
                if (Greenfoot.isKeyDown("w")) {
                    velocityY = -10;
                }
            }
        }
                        
        for(Actor diamand : getIntersectingObjects(Diamand.class))
        {
            if((diamand != null))
            {
                World myWorld = getWorld();
                getWorld().removeObject(diamand);
                diamanten++;
                IntroductieLevel world = (IntroductieLevel)myWorld;
                
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
            animation();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
            animation();
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
