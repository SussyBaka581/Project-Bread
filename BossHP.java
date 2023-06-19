import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossHP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossHP extends Bar
{
    public BossHP(int w, int h){
        super(w,h,Color.GREEN,Color.GRAY);
    }
    /**
     * Act - do whatever the BossHP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        BarPercent = (double) CombatModule.currentBoss.health/CombatModule.currentBoss.maxHealth;
    }
}
