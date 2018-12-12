import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VragenTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VragenTekst extends Mover
{
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Als je dit bord tegen komt, dan is het een vraag die je moet oplosse voor een letter en diamanten",30 , Color.BLACK, new Color(0,0,0,0)));
    }    
}
