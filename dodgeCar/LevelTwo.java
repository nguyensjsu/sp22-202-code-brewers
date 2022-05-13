import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends World implements ILevelInterface
{

    private static final Random _rand = new Random(37L);
    GreenCar greenCar;
    List<RedCar> redCars;
    List<LifeObstacle> lifeObstacles;
    List<Integer> xPositions;
    List<Integer> xHistory;
    private int speed;
    long numRedCarsAdded = 0L;
    int maxRedCars = 5;
    int maxLifeObstacle = 1;
    KeyInputMenuItem leftItem;
    KeyInputMenuItem rightItem;
    IKeyboardCommand leftCommand;
    IKeyboardCommand rightCommand;
    KeyInputMenu menu = new KeyInputMenu();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelTwo(int speed)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        Greenfoot.setSpeed(50);
        
        GreenfootImage image = getBackground();
        image.scale(600, 600);
        
        xHistory = new ArrayList<>();
        xPositions = new ArrayList<>(List.of(60, 180, 300, 420, 540));
        
        setupKeyboardMenu();

        greenCar = GreenCar.getNewInstance(this);
        redCars = new ArrayList<>();
        lifeObstacles = new ArrayList<>();
        
        addObject(greenCar, greenCar.getX(), greenCar.getY());
        addObject(new Lifeline(this), 85, 10);
        this.speed = speed;
        addRedCar(speed);
        addLifeObstacle(speed);
    }

    private void setupKeyboardMenu() {
        leftItem = new KeyInputMenuItem();
        rightItem = new KeyInputMenuItem();
        leftCommand = new KeyboardCommand();
        rightCommand = new KeyboardCommand();

        leftCommand.setReceiver(
            new IKeyboardReceiver() {
                /** Command Action */
                public void doAction() {
                    greenCar.decrementXCoord();
                }
            }
        );

        rightCommand.setReceiver(
            new IKeyboardReceiver() {
                /** Command Action */
                public void doAction() {
                    greenCar.incrementXCoord();
                }
            }
        );

        leftItem.setCommand(leftCommand);
        rightItem.setCommand(rightCommand);
        menu.addItem("left", leftItem);
        menu.addItem("right", rightItem);
    }
    
    public void act() {
        super.act();

        String key = getValidPressedKey();

        if(key != null) {
            menu.selectItem(key);
        }

        if (redCars.size() < maxRedCars) {
            double p = _rand.nextDouble();
            if (p > 0.995d) {
                addRedCar(this.speed);
            }
        }
        if (lifeObstacles.size() < maxLifeObstacle) {
            double p = _rand.nextDouble();
            if (p > 0.995d) {
                addLifeObstacle(this.speed);
            }
        }
    }
    
    private void addRedCar(int speed) {
        RedCar redCar = new RedCar(getRandomXPosition(), speed);
        redCars.add(redCar);
        addObject(redCar, redCar.getX(), redCar.getY());
        numRedCarsAdded += 1L;
    }

    private void addLifeObstacle(int speed) {
        LifeObstacle lifeObstacle = new LifeObstacle(getRandomXPosition(), speed);
        lifeObstacles.add(lifeObstacle);
        addObject(lifeObstacle, lifeObstacle.getX(), lifeObstacle.getY());
    }
    
    public void removeRedCar(RedCar redCar) {
        redCars.remove(redCars.size() - 1);
        removeObject(redCar);
    }

    public void removeLifeObstacle(LifeObstacle lifeObstacle) {
        lifeObstacles.remove(lifeObstacles.size() - 1);
        removeObject(lifeObstacle);
    }
    
    public long getScore() { return numRedCarsAdded; }
    
    public int getLevel() { return maxRedCars - 5 + 1; }
    
    private int getRandomXPosition() {
        int numPositions = xPositions.size();
        int index = -1;
        while (true) {
            index = _rand.nextInt(numPositions);
            
            if (!xHistory.contains(index)) {
                xHistory.add(index);
                break;
            }
        }
        
        if (xHistory.size() >= 5) {
            xHistory.remove(0);
        }
        
        return xPositions.get(index);
    }
    
    private List<Integer> getXPositions() {
        int carWidth = (new RedCar()).getWidth();
        int gameWidth = getWidth();
        List<Integer> positions = new ArrayList<>();
        for (int i = 5; i < gameWidth; i += carWidth) {
            positions.add(i);
        }
        return positions;
    }

    private String getValidPressedKey() {
        if(Greenfoot.isKeyDown("right")) {
            return "left";
        }

        if(Greenfoot.isKeyDown("left")) {
            return "right";
        }

        // if(Greenfoot.isKeyDown("up")) {
        //     return "up";
        // }

        // if(Greenfoot.isKeyDown("down")) {
        //     return "down";
        // }

        return null;
    }
}
