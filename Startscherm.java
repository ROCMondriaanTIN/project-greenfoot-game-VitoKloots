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
        this.setBackground("achtergrond7.jpg");
        getBackground().scale(1000, 800);
        Hero.levens = 1;
        Letter.teller = 0;
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new PersonageSelecter());
    }
}
