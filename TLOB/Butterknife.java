import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butterknife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butterknife extends Player
{
    GreenfootImage myImage;
    /**
     * Act - do whatever the Butterknife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class)){
            myImage = new GreenfootImage("jerma2.jpg");
            setImage(myImage);
        }
    }
}
