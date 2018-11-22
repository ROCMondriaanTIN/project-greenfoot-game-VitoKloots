import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VragenBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VragenBoard extends Mover
{
    
        int timer = 1000;
    public VragenBoard()
    {
        setImage("BlenderBord.png");
    }
    public void act() 
    {
        applyVelocity();
        click();
        timer--;
        if (timer <= 0) {
           setImage("BlenderBord.png");
           timer = 1000;
        }
    }    
    void click(){
        if(Greenfoot.mouseClicked(this)){
            setImage("Plank.png");
            
        }
        
    }
}
