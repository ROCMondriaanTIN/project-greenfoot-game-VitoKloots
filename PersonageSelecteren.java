import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PersonageSelecter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonageSelecteren extends Actor
{
    public PersonageSelecteren()
    {
        setImage("PersonageSelecteren.png");  
        getImage().scale(300, 25);
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.setWorld(new PersonageSelecter());
        } 
    }    
}
