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
    
    public void checkCollision()
    {
        int collisionCheck = this.machine.checkCollision();
        if(collisionCheck==1)
        {
            this.decrementLife();
            this.machine.setTwoLifeLineState();
        }
    }
    
    public void decrementLife()
    {
        this.machine.decrementLife();
    }
    
    public void incrementLife()
    {
    }
    
}
