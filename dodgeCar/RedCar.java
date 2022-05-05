import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

/**
 * Write a description of class RedCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCar extends Actor
{
    private static final Random _rand = new Random(37L);
    private int speed;
    private int x;
    private int y;
    
    public RedCar() {
        x = 0;
        y = 0;
    }
    
    public RedCar(int x, int speed) {
        this.x = x;
        this.y = getImage().getHeight() / 2;
        this.speed = speed;
    }
    
    public RedCar(World world, int speed) {
        int wWidth = world.getWidth();
        int wHeight = world.getHeight();
        int iHeight = getImage().getHeight();
        this.speed = speed;
        x = _rand.nextInt(wWidth);
        y = iHeight / 2;
    }
    /**
     * Act - do whatever the RedCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        y = y + this.speed;
        setLocation(x, y);
        if (isAtEdge()) {
            ((ILevelInterface)getWorld()).removeRedCar(this);
        }
    }    
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return getImage().getWidth(); }
    public int getHeight() { return getImage().getHeight(); }
}
