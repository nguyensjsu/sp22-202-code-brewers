import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarStateMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarStateMachine extends Actor implements ICarStateMachine
{
    // instance variables - replace the example below with your own
    private int health;
    private NoLifeLineState s0;
    private OneLifeLineState s1;
    private TwoLifeLineState s2;
    private ThreeLifeLineState s3;
    
    private ICarState state;

    /**
     * Constructor for objects of class CarStateMachine
     */
    public CarStateMachine()
    {
        this.health = 3;
        this.s0 = new NoLifeLineState(this);
        this.s1 = new OneLifeLineState(this);
        this.s2 = new TwoLifeLineState(this);
        this.s3 = new ThreeLifeLineState(this);
        this.state = this.s3;
    }
    
    public int checkCollision()
    {
        System.out.println("Here!!");
        RedCar redCar = (RedCar) getOneIntersectingObject(RedCar.class);
        if (redCar != null)
        {
            System.out.println("Red car collided and detected!");
            return 1;
        }

        LifeLine lifeLine = (LifeLine) getOneIntersectingObject(LifeLine.class);
        if (lifeLine != null)
        {
            return 2;
        }

        return 0;
    }
    
    public void decrementLife()
    {
        this.health--;
    }
    
    public void incrementLife()
    {
        this.health++;
    }
    
    public void setNoLifeLineState()
    {
        this.state = this.s0;
    }
    
    public void setOneLifeLineState()
    {
        this.state = this.s1;
    }
    
    public void setTwoLifeLineState()
    {
        this.state = this.s2;
    }
    
    public void setThreeLifeLineState()
    {
        this.state = this.s3;
    }
    
    public int getHealth()
    {
        return this.health;
    }

}
