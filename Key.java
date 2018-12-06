import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Mover
{  
    public static int tellerKey;
    public Key(){
        setImage("keyBlue.png");
    }
    public void act() 
    {
        applyVelocity();        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                getWorld().addObject(new HudKey(), 800, 700); 
                getWorld().removeObject(this);
                tellerKey++;
                break;
            }
        }

    }
    
}
