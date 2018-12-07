import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speler2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speler2 extends Actor
{

    public Speler2()
    {
        setImage("p2.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelecter());
            Speler1.HeroSelecter = 2;
        }
        
    }    
}
