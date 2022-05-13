/**
 * Write a description of class ThreeLifeLineState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeLifeLineState implements ICarState
{
    ICarStateMachine machine;
    /**
     * Constructor for objects of class ThreeLifeLineState
     */
    public ThreeLifeLineState(ICarStateMachine m)
    {
        this.machine = m;
    }

    public void redCarCollision()
    {
        this.decrementLife();
        this.machine.setTwoLifeLineState();
    }

    public void lifeObstacleCollision()
    {
    }
    
    public void decrementLife()
    {
        this.machine.decrementLife();
    }
    
    public void incrementLife()
    {
    }
    
}
