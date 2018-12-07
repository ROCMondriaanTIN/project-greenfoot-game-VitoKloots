import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speler1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speler1 extends Actor
{
    public static int HeroSelecter;
    
    public Speler1()
    {
        setImage("p1.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelecter());
            Speler1.HeroSelecter = 1;
        }
        
    }    
}
