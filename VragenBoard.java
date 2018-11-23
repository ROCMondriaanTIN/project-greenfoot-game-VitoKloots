import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class VragenBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VragenBoard extends Mover
{
    
        
    public VragenBoard()
    {
        setImage("BlenderBord.png");
    }
    public void act() 
    {
        applyVelocity();
        click();
        
    }    
    void click(){
        if(Greenfoot.mouseClicked(this)){
            String antwoord = Greenfoot.ask("wat is fiets in het engels?");            
            if("bike".equals(antwoord)){     
                getWorld().addObject(new Diamand(), 1087,2125);
                getWorld().addObject(new Diamand(), 1187,2125);
                getWorld().addObject(new Diamand(), 1287,2125);
                getWorld().removeObject(this);
            }
        }
        
    }    
}
