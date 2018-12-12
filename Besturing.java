import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5Knop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Besturing extends Mover
{
    public Besturing()
    {
        
    }
    public void act() 
    {
        setImage(new GreenfootImage("Besturing",50 , Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new Besturing_Knoppen());
        }
    }    
}
