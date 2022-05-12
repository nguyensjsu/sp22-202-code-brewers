/**
 * Write a description of class ICarStateMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ICarStateMachine  
{
    int checkCollision();
    void decrementLife();
    void incrementLife();
    void setNoLifeLineState();
    void setOneLifeLineState();
    void setTwoLifeLineState();
    void setThreeLifeLineState();
}
