import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tripmine extends Player
{
    GreenfootImage mine;
    GreenfootImage mine2;
    boolean mCollect = false;
    /**
     * Act - do whatever the Item1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(mCollect == false){
           mine2 = new GreenfootImage("subspacemine.png");
           mine2.scale(50,50);
           setImage(mine2);
        }
        if(isTouching(Player.class) && mCollect == false){
            mine = new GreenfootImage("tombstone2.png");
            mine.scale(50,50);
            setImage(mine);
            mCollect = true;
        }
    }
}
