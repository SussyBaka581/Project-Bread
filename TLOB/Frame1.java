import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame1 extends ControlWorld
{   
    public boolean world2;
    /**
     * Constructor for objects of class world1.
     * 
     */
    public Frame1()
    {
        super(600, 400, 1);
        addObject(new Player(), 300, 200);
        if(player.getX() == (getWidth() - 1)){
            World world = new Frame2();
            Greenfoot.setWorld(world);
        }
    }
}
