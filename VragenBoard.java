import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class VragenBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VragenBoard extends Mover
{
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;
    
    public VragenBoard(CollisionEngine collisionEngine, TileEngine tileEngine)
    {
        setImage("VragenBord.png");
        this.tileEngine = tileEngine;
        this.collisionEngine = collisionEngine;        
    }
    public void act() 
    {
        applyVelocity();
        click();
    }   
    void click(){
            if(Greenfoot.mouseClicked(this)){
            String kleineLetters;
            String antwoord = Greenfoot.ask("Wat is fiets in het engels?");
            antwoord = antwoord.toLowerCase();
            if("bike".equals((antwoord)) ||("bicycle".equals(antwoord))){     
                getWorld().addObject(new Diamand(), 1087,2125);
                getWorld().addObject(new Diamand(), 1187,2125);
                getWorld().addObject(new Diamand(), 1287,2125);
                getWorld().addObject(new Letter('V'), 415, 2335);
                getWorld().addObject(new Letter('V'), 415, 2335);
                getWorld().addObject(new Letter('V'), 415, 2335);
            }else
                    {
                        Greenfoot.setWorld(new GameOver());
                    }
                
               for (Tile tile : getWorld().getObjects(Lava.class)) {
                   if(tile.type == TileType.LAVA_REMOVE){
                        tileEngine.removeTile(tile);
                    }
                    
                }
                
                getWorld().removeObject(this);
            
        }
    }
}    

