import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeurMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeurMid extends Mover
{
    public DeurMid()
    {
        setImage("door_openMid.png");
    }
    public void act() 
    {
        applyVelocity();
        if (Greenfoot.isKeyDown("s")) Greenfoot.setWorld(new Startscherm());
        
    }    
}
