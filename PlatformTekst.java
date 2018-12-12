import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformTekst extends Mover
{
    public PlatformTekst()
    {
        setImage(new GreenfootImage("Over deze platformen moet je heen springen maar pas op dat je er niet tussen valt",30 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Over deze platformen moet je heen springen maar pas op dat je er niet tussen valt",30 , Color.BLACK, new Color(0,0,0,0)));
    }    
}
