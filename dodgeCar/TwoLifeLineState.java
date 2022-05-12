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
    
    public void checkCollision()
    {
        int collisionCheck = this.machine.checkCollision();
        if(collisionCheck==1)
        {
            this.decrementLife();
            this.machine.setOneLifeLineState();
        }
        else if(collisionCheck==2)
        {
            this.incrementLife();
            this.machine.setThreeLifeLineState();
        }
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
