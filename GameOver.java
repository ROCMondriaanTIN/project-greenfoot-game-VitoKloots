import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        Greenfoot.start();
        this.setBackground("GameoverScherm99.png");
        Hero.levens = 1;
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("r")) Greenfoot.setWorld(new MyWorld());
    }
}
