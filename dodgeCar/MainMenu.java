import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MainMenu extends World
{
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        showMainMenu();
        prepare();
    }

    public void showMainMenu(){
        Menu menu = new Menu();
        addObject(menu, 350, 225);
        LevelOneButton oneButton = new LevelOneButton();
        LevelTwoButton twoButton = new LevelTwoButton();
        addObject(oneButton,350,300);
        addObject(twoButton,350,475);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
}
