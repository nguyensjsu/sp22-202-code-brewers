import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        displayScore();
    }
    
    private void displayScore(){
        long score = Score.getInstance().getScore();
        showText("Score:  " + score, 325,125);
        Over ov = new Over();
        addObject(ov, 350, 325);
    }
}
