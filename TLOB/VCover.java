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
    /**
     * Act - do whatever the Item3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) && hasVCover == false){
            vcover = new GreenfootImage("tombstone2.png");
            vcover.scale(50,50);
            setImage(vcover);
            hasVCover = true;
        }
    }
}
