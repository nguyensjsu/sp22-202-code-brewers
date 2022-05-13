import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Write a description of class GreenCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenCar extends Actor
{
    private int x;
    private int y;
    private static GreenCar greenCarInstance = null;
    private int health = 1;
    private CarStateMachine csm;

    
    public GreenCar(World world) {
        int wWidth = world.getWidth();
        int wHeight = world.getHeight();
        int iWidth = getImage().getWidth();
        int iHeight = getImage().getHeight();
        
        x = (wWidth / 2) - (iWidth / 2);
        y = wHeight - (iHeight / 2);
        
        csm = new CarStateMachine();
    }

    public int getHealth(){
        return this.csm.getHealth();
    }

    public static GreenCar getInstance() {
        if(greenCarInstance == null ) {
            System.out.println("No instance found");
        }

        return greenCarInstance;
    }

    public static GreenCar getNewInstance(World world) {
        greenCarInstance = new GreenCar(world);    
        return greenCarInstance;
    }

    /**
     * Act - do whatever the GreenCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(x, y);
        System.out.println("Hi!!");
        this.csm.checkCollision();
        // checkCollision();
    }    
    
    // public void checkCollision() {
    //     RedCar redCar = (RedCar) getOneIntersectingObject(RedCar.class);
    //     if (redCar != null) {
    //         decrementHealth();
    //         if(health == 0) {
    //             Greenfoot.stop();
    //         }
    //     }
    // }
    
    public int getX() { return x; }
    public int getY() { return y; }

    public void decrementHealth() {
        health = health - 1;
    }

    public void incrementHealth() {
        health = health + 1;
    }
    
    public void incrementXCoord() {
        x = x + 1;
    }

    public void decrementXCoord() {
        x = x - 1;
    }

    public void incrementYCoord() {
        y = y + 1;
    }

    public void decrementYCoord() {
        y = y - 1;
    }
}

