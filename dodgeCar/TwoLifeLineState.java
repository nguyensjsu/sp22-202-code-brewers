/**
 * Write a description of class TwoLifeLineState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoLifeLineState implements ICarState
{
    ICarStateMachine machine;
    /**
     * Constructor for objects of class TwoLifeLineState
     */
    public TwoLifeLineState(ICarStateMachine m)
    {
        this.machine = m;
    }

    public void redCarCollision()
    {
        this.decrementLife();
        this.machine.setOneLifeLineState();
    }

    public void lifeObstacleCollision()
    {
        this.incrementLife();
        this.machine.setThreeLifeLineState();
    }
    
    public void decrementLife()
    {
        this.machine.decrementLife();
    }
    
    public void incrementLife()
    {
        this.machine.incrementLife();
    }
}
