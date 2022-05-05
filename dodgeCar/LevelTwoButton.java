import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeveltWOButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwoButton extends Actor
{
    /**
     * Act - do whatever the LeveltWOButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LevelTwoButton(){
        GreenfootImage image = getImage();
        image.scale(175, 100);
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            StrategyBuilder stratBuilder = new StrategyBuilder();
            stratBuilder.buildLevel(2);
        }// Add your action code here.
    }
}
