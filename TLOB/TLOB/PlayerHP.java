import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerHP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerHP extends Bar
{
    public PlayerHP(int w, int h){
        super(w,h,Color.YELLOW,Color.RED);
    }
    /**
     * Act - do whatever the PlayerHP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        BarPercent = CombatPlayer.health/(double) 10;
    }
}
