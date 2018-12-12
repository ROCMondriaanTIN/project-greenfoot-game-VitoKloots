import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Besturing_Knoppen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Besturing_Knoppen extends World
{

    /**
     * Constructor for objects of class Besturing_Knoppen.
     * 
     */
    public Besturing_Knoppen()
    {  
        super(1000, 800, 1);
        this.setBackground("Controlls uitleg.png");
         
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("r")) Greenfoot.setWorld(new LevelSelecter());
    }
}
