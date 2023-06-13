import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MercyBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MercyBtn extends Actor
{
    /**
     * Act - do whatever the MercyBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Player.class)) {
            setImage("MercyBtnSelected.png");
        }
        else {
            setImage("MercyBtn.jpg");
        }
    }    
}
