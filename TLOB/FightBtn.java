import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FightBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightBtn extends Actor
{
    /**
     * Act - do whatever the FightBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(CombatPlayer.class)) {
            setImage("FightBtnSelected.jpg");
        }
        else {
            setImage("FightBtn.png");
        }
    }
}
