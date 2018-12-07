import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speler3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speler3 extends Actor
{
    
    public Speler3()
    {
        setImage("p3.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelecter());
            Speler1.HeroSelecter = 3;
        }
        
    }    
}
