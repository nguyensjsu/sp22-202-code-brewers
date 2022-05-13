import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends Actor
{
    /**
     * Act - do whatever the Over wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Over(){
        GreenfootImage image = getImage();
        image.scale(175, 100);
    } 

    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            resetScore();
            Greenfoot.setWorld(new MainMenu());
        }
    }

    private void resetScore(){
        Score.getInstance().reset();
    }
}
