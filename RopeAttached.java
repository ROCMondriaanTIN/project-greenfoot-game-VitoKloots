import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RopeAttached here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RopeAttached extends Tile
{
    public boolean isSolid = false;
    private static int id;
    public int _id;  
    
    public RopeAttached(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ÃD: " + id, 10, 10);
        }
        _id = id;
        id++;
    }   
}

