import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LadderTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LadderTekst extends Mover
{
    public LadderTekst()
    {
        setImage(new GreenfootImage("Bij deze 3 objecten kan je klimmen als je wanneer je ze aanraakt.",30 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Bij deze 3 objecten kan je klimmen als je wanneer je ze aanraakt.",30 , Color.BLACK, new Color(0,0,0,0)));
    }    
}
