import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeurTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeurTop extends Mover
{
   public DeurTop()
    {
        setImage("door_openTop.png");
    }
    public void act() 
    {
        applyVelocity();        
    }    
}
