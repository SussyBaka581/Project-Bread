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
    /**
     * Act - do whatever the Item1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class) && hasMine == false){
            mine = new GreenfootImage("tombstone2.png");
            mine.scale(50,50);
            setImage(mine);
            hasMine = true;
        }
    }
}
