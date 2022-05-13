import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeObstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class LifeObstacle extends CollisionDecorator
{
    /**
     * Act - do whatever the LifeObstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Random _rand = new Random(37L);
    private int speed;
    private int x;
    private int y;
    private int[] xPos = {60, 180, 300, 420, 540};
    
    public LifeObstacle() {
        x = 0;
        y = 0;
    }
    
    public LifeObstacle(int x, int speed) {
        this.x = x;
        this.y = getImage().getHeight() / 2;
        this.speed = speed;
    }

    public LifeObstacle(World world, int speed) {
        int wWidth = world.getWidth();
        int wHeight = world.getHeight();
        int iHeight = getImage().getHeight();
        this.speed = speed;
        x = this.xPos[_rand.nextInt(this.xPos.length)];
        y = iHeight / 2;
    }

    public void checkCollision() {
        GreenCar greenCar = (GreenCar) getOneIntersectingObject(GreenCar.class);
        GreenCar greenCarIns = GreenCar.getInstance();
        if (greenCar != null) {
            greenCarIns.lifeObstacleCollision();
            getWorld().removeObject(this);
            return;
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return getImage().getWidth(); }
    public int getHeight() { return getImage().getHeight(); }

    public void act()
    {
        y = y + this.speed;
        setLocation(x, y);
        checkCollision();    
    }
}
