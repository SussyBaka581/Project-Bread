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
    GreenfootImage screws2;
    boolean sCollect = false;
    /**
     * Act - do whatever the Item4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(sCollect == false){
           screws2 = new GreenfootImage("screw.png");
           screws2.scale(45,45);
           setImage(screws2);
        }
        if(isTouching(Player.class) && sCollect == false){
            screws = new GreenfootImage("tombstone2.png");
            screws.scale(50,50);
            setImage(screws);
            sCollect = true;
        }
    }
}
