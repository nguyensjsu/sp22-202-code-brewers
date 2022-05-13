/**
 * Write a description of class OneLifeLineState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneLifeLineState implements ICarState
{
    ICarStateMachine machine;
    /**
     * Constructor for objects of class OneLifeLineState
     */
    public OneLifeLineState(ICarStateMachine m)
    {
        this.machine = m;
    }

    public void redCarCollision()
    {
        this.decrementLife();
        this.machine.setNoLifeLineState();
    }

    public void lifeObstacleCollision()
    {
        this.incrementLife();
        this.machine.setTwoLifeLineState();
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
