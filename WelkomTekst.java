import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelkomTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelkomTekst extends Mover
{
    public WelkomTekst()
    {
        setImage(new GreenfootImage("Welkom bij het introductie level hier leer je hoe je het Leerzame Doolhof speelt!",30 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Welkom bij het introductie level hier leer je hoe je het Leerzame Doolhof speelt!",30 , Color.BLACK, new Color(0,0,0,0)));
    }    
}
