import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroductieLevelKnop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroductieLevelKnop extends Actor
{
    public IntroductieLevelKnop()
    {
        setImage("Introductie level.png");  
        getImage().scale(300, 200);
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new IntroductieLevel());
        } 
    }    
}
