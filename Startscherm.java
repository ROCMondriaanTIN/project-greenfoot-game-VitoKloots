import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{

    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    public Startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        Greenfoot.start();
        this.setBackground("Floating_island_startscherm.png");
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new MyWorld());
    }
}
