import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Knop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Knop extends Mover
{
    public void act() 
    {
        setImage(new GreenfootImage("2",50 , Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new Level1());
        }
    }    
}
