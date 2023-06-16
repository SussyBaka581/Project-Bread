import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlWorld extends World
{   static Actor player;
    public World world;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ControlWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        world = new Frame1();
        player = new Player();
        Greenfoot.setWorld(world);
        world.addObject(player, 500, 400);
    }
    
    public void act()
    {
        //BOTTOM LEVEL LEFT/RIGHT
        
        //forward to 2
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15))
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 1
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame1();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        //forward to 3
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15)){
            world = new Frame3();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 2
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        
        //BOTTOM LEVEL UP/DOWN
        
        //up to 4
        if(player.getY() == 0)
        {
            world = new Frame4();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 1
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame1();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
    }
    
    public ControlWorld (int width, int height, int cellsize){
        super(width, height, cellsize);
    }
}
