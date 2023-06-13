import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ItemBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemBtn extends Actor
{
    /**
     * Act - do whatever the ItemBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Player.class)) {
            setImage("ItemBtnSelected.png");
        }
        else {
            setImage("ItemBtn.jpg");
        }
    }    
}
