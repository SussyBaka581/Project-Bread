import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActBtn extends Actor
{
    /**
     * Act - do whatever the ActBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(CombatPlayer.class)) {
            setImage("ActBtnSelected.jpg");
        }
        else {
            setImage("ActBtn.jpg");
        }
    }    
}
