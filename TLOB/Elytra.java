import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elytra extends Player
{
    GreenfootImage elytra;
    /**
     * Act - do whatever the Item2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class)){
            elytra = new GreenfootImage("tombstone2.png");
            elytra.scale(50,50);
            setImage(elytra);
        }
    }
}
