import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PersonageSelecter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonageSelecter extends World
{

    /**
     * Constructor for objects of class PersonageSelecter.
     * 
     */
    public PersonageSelecter()
    {    
        super(1000, 800, 1);
        this.setBackground("achtergrond9.jpg");
        addObject(new Speler1(), 266, 400);
        if(Hero.levelKey == 1)
        {
            addObject(new Speler2(), 522, 400);
        }
        if(Hero.levelKey == 2)
        {
            addObject(new Speler3(), 789, 400);
        }
    }
}
