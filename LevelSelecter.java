import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transitiescherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelecter extends World
{
    /**
     * Constructor for objects of class Transitiescherm.
     * 
     */
    public LevelSelecter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("achtergrond8.jpg");

        addObject(new IntroductieLevelKnop(), 140, 131);
        addObject(new PersonageSelecteren(), 760, 85);
        addObject(new Level1Knop(), 140, 160);
        addObject(new Level2Knop(), 140, 220);
        addObject(new Level3Knop(), 140, 280);
        addObject(new Level4Knop(), 140, 340);
        addObject(new Level5Knop(), 140, 400);
        addObject(new Besturing(), 730, 302);
    }
}
