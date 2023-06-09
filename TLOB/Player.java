import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (Aidan Wittish) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int moveX = 5;
    int moveY = 5;
    public void act()
    {
        //Basic movement
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-moveY);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+moveY);
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-moveX, getY());
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+moveX, getY());
        }
        //temporary features
        if(Greenfoot.isKeyDown("shift")){
            moveX = 10;
            moveY = 10;
        }
        if(Greenfoot.isKeyDown("C")){
            moveX = 2;
            moveY = 2;
        }
        //resets movement
        if(Greenfoot.isKeyDown("P")){
            moveX = 5;
            moveY = 5;
        }
        //Update movement
        //setLocation(getX() + moveX, getY() + moveY); 
        
    }
}
