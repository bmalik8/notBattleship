
/**
 * Write a description of interface Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Player
{
    static final int IDLE = 0;
    static final int LOOKING = 1;
    static final int PICKING = 2;
    void start();
    
    void stop();
    
    int getScore();

    void setScore(int score);
}
