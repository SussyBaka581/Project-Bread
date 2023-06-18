import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screws extends Player
{
    GreenfootImage screws;
    /**
     * Act - do whatever the Item4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) && hasScrews == false){
            screws = new GreenfootImage("tombstone2.png");
            screws.scale(50,50);
            setImage(screws);
            hasScrews = true;
        }
    }
}
