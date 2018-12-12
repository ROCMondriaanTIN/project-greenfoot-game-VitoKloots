import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimerIntroductie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimerIntroductie extends Actor
{
    int teller;
    int timer = 300;
    public void act() 
    {
        setImage(new GreenfootImage("" + timer,30 , Color.BLACK, new Color(0,0,0,0)));
        teller++;
        if(teller == 60){
            timer--;
            teller = 0;
        }
        if(timer < 0) Greenfoot.setWorld(new GameOver());
    }    
}
