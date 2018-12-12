import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EindDeur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slot extends Mover
{
    public Slot()
    {
        setImage("lock_blue.png");
    }
    public void act() 
    {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class))
        {
            if((hero != null)&&((Key.tellerKey == 1))){
                getWorld().removeObject(this);
                Greenfoot.setWorld(new LevelSelecter());
            }
        }
    }  
}



