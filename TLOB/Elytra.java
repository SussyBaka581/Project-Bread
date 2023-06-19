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
    GreenfootImage elytra2;
    boolean eCollect = false;
    /**
     * Act - do whatever the Item2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //default image
        if(eCollect == false){
           elytra2 = new GreenfootImage("elytra.png");
           elytra2.scale(75, 75);
           setImage(elytra2);
        }
        if(isTouching(Player.class) && eCollect == false){
            elytra = new GreenfootImage("tombstone2.png");
            elytra.scale(50,50);
            setImage(elytra);
            eCollect = true;
        }
    }
}
