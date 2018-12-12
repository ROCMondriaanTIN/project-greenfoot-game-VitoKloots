import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTekst extends Mover
{
    public EnemyTekst()
    {
        setImage(new GreenfootImage("Kijk een Vijand snel spring erover heen!!!",30 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act() 
    {
        applyVelocity();
        setImage(new GreenfootImage("Kijk een Vijand snel spring erover heen!!!",30 , Color.BLACK, new Color(0,0,0,0)));
    }    
}
