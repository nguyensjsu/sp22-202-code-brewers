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
    
    public void checkCollision()
    {
        int collisionCheck = this.machine.checkCollision();
        if(collisionCheck==1)
        {
            this.decrementLife();
            this.machine.setNoLifeLineState();
        }
        else if(collisionCheck==2)
        {
            this.incrementLife();
            this.machine.setTwoLifeLineState();
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
