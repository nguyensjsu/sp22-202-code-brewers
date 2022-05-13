import greenfoot.*;
/**
 * Write a description of class StrategyBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StrategyBuilder implements IStrategy
{
    // instance variables - replace the example below with your own
    private ILevelInterface level;
    private int levelOneSpeed = 4;
    private int levelTwoSpeed = 7;

    /**
     * Constructor for objects of class StrategyBuilder
     */
    public StrategyBuilder()
    {
    }
    
    public int getLevelOneSpeed(){
        return this.levelOneSpeed;
    }
    
    public int getLevelTwoSpeed(){
        return this.levelTwoSpeed;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void buildLevel(int x)
    {
        if (x==1){
             Greenfoot.setWorld(new LevelOne(this.getLevelOneSpeed()));
        }
        else{
            Greenfoot.setWorld(new LevelTwo(this.getLevelTwoSpeed()));
        }
    }
}
