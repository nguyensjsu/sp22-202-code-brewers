import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOneButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOneButton extends Actor
{
    /**
     * Act - do whatever the LevelOneButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LevelOneButton(){
        GreenfootImage image = getImage();
        image.scale(200, 200);
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            StrategyBuilder stratBuilder = new StrategyBuilder();
            stratBuilder.buildLevel(1);
        }// Add your action code here.
    }
}
