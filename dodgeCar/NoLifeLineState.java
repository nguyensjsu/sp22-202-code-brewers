import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class NoLifeLineState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoLifeLineState implements ICarState
{
    ICarStateMachine machine;
    /**
     * Constructor for objects of class NoLifeLineState
     */
    public NoLifeLineState(ICarStateMachine m)
    {
        this.machine = m;
    }

    public void redCarCollision()
    {
        Greenfoot.setWorld(new GameOver());
    }

    public void lifeObstacleCollision()
    {
        this.incrementLife();
        this.machine.setOneLifeLineState();
    }
    
    public void decrementLife()
    {
    }
    
    public void incrementLife()
    {
        this.machine.incrementLife();
    }
}
