/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score  
{
    // instance variables - replace the example below with your own
    private long score = 0;
    private static Score sc = null;
    /**
     * Constructor for objects of class Score
     */
    // public Score(){
    //     getInstance();
    //     score = 0;
    // }
    
    public static Score getNewInstance(){
        sc = new Score();
        return sc;
    }
    
    public static Score getInstance(){
        if (sc==null){
            sc = getNewInstance();
        }
        return sc;
    }
    
    public long getScore(){
        return score;
    }
    
    public void incrementScore(){
        score++;
    }

    public void reset(){
        score = 0;
    }
}
