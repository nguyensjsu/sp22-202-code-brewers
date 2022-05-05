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

    /**
     * Constructor for objects of class StrategyBuilder
     */
    public StrategyBuilder()
    {
    }
    
    public int levelOneSpeed(){
        return 2;
    }
    
    public int levelTwoSpeed(){
        return 5;
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
             Greenfoot.setWorld(new LevelOne(this.levelOneSpeed()));   
        }
        else{
            Greenfoot.setWorld(new LevelTwo(this.levelTwoSpeed()));    
        }
    }
}
