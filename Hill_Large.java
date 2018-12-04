import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hill_Large here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hill_Large extends Mover
{
    /**
     * Act - do whatever the Hill_Large wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hill_Large() 
    {
        setImage("hill_large.png");
    } 
    public void act()
    {
        applyVelocity();
        menneke();
    }
    void menneke()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().addObject(new Diamand(), 1087,2125);
            getWorld().addObject(new Diamand(), 1187,2125);
            getWorld().addObject(new Diamand(), 1287,2125);
            getWorld().removeObject(this);
            if(Greenfoot.mouseClicked(this))
            {
              getWorld().addObject(new Hill_Small(), 856, 2335);
            }
        }
    }
}
