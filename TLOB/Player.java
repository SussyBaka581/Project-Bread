import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (Aidan Wittish) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    boolean hasButterknife = false;
    int moveX = 5;
    int moveY = 5;
    public void act()
    {
        //Basic movement
        if(Greenfoot.isKeyDown("W") && !isTouching(InvisibleWallUp.class)){
            setLocation(getX(), getY()-moveY);
        }
        if(Greenfoot.isKeyDown("S") && !isTouching(InvisibleWallDown.class)){
            setLocation(getX(), getY()+moveY);
        }
        if(Greenfoot.isKeyDown("A") && !isTouching(InvisibleWallLeft.class)){
            setLocation(getX()-moveX, getY());
        }
        if(Greenfoot.isKeyDown("D") && !isTouching(InvisibleWallRight.class)){
            setLocation(getX()+moveX, getY());
        }
        //sprinting
        if(Greenfoot.isKeyDown("shift")){
            moveX = 10;
            moveY = 10;
        }
        //resets movement
        else{
            moveX = 5;
            moveY = 5;
        }
        
        //Invisible wall detection
        //if(isTouching(InvisibleWallLeft.class)){
        //    moveX = 0;
        //}
    }
}
