/**
 * Write a description of class ILevelInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface ILevelInterface  
{
    void act();
    void removeRedCar(RedCar redcar);
    void removeLifeObstacle(LifeObstacle lifeObstacle);
    long getScore();
    int getLevel();
}
