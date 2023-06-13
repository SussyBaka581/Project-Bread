import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlWorld extends World
{   static Actor player;
    public int worldNum;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ControlWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Player();
        World world = new Frame1();
        Greenfoot.setWorld(world);
        world.addObject(player, 300, 200);
        worldNum = 1;
    }
    
    public void act()
    {
        if(player.getX() == getWidth()- 1 /*&& worldNum == 1*/)
        {
            World world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, 2, 200);
            worldNum = 2;
        }
        if(player.getX() == 0) /*&& worldNum == 2*/
        {
            World world = new Frame1();
            Greenfoot.setWorld(world);
            world.addObject(player, 598, 200);
            worldNum = 1;
        }
    }
    
    public ControlWorld (int width, int height, int cellsize){
        super(width, height, cellsize);
    }
}
