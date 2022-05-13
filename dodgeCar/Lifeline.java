import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifeline extends Actor
{
    private ILevelInterface world;
    
    public Lifeline(ILevelInterface world) {
        this.world = world;
    }
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String s = "Score: " + world.getScore() + ", Health: " + GreenCar.getInstance().getHealth();
        GreenfootImage img = new GreenfootImage(s, 24, Color.GREEN, Color.BLACK);
        setImage(img);
    }    
}

