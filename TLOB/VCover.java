import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VCover extends Player
{
    GreenfootImage vcover;
    GreenfootImage vcover2;
    boolean vCollected = false;
    /**
     * Act - do whatever the Item3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(vCollected == false){
           vcover2 = new GreenfootImage("coverofvent.png");
           vcover2.scale(75,75);
           setImage(vcover2);
        }
        if(isTouching(Player.class) && vCollected == false){
            vcover = new GreenfootImage("tombstone2.png");
            vcover.scale(50,50);
            setImage(vcover);
            vCollected = true;
        }
    }
}
