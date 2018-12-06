import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelecter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelecter extends World
{

    /**
     * Constructor for objects of class LevelSelecter.
     * 
     */
    public LevelSelecter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("achtergrond8.jpg");
        addObject(new IntroductieLevelKnop(), 500, 400);

    }
}
