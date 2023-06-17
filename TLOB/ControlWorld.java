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
        //up to 5
        if(player.getY() == 0)
        {
            world = new Frame5();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 2
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        //up to 6
        if(player.getY() == 0)
        {
            world = new Frame6();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 3
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame3();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        
        //MIDDLE ROW LEFT/RIGHT
        
        //forward to 5
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15))
        {
            world = new Frame5();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 4
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame4();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        //forward to 6
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15)){
            world = new Frame6();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 5
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame5();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        
        //MIDDLE ROW UP/DOWN
        
        //up to 7
        if(player.getY() == 0)
        {
            world = new Frame7();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 4
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame4();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        //up to 8
        if(player.getY() == 0)
        {
            world = new Frame8();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 5
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame5();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        //up to 9
        if(player.getY() == 0)
        {
            world = new Frame9();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 6
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15)
        {
            world = new Frame6();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        
        //TOP ROW LEFT/RIGHT
        
        //forward to 8
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15))
        {
            world = new Frame8();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 7
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame7();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        //forward to 9
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15)){
            world = new Frame9();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 8
        if((player.getX() == 10 || player.getX() == 15))
        {
            world = new Frame8();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
    }
    
    public ControlWorld (int width, int height, int cellsize){
        super(width, height, cellsize);
    }
    
    public void left(int x, int y){
        addObject(new InvisibleWallLeft(), x, y);
    }
    public void right(int x, int y){
        addObject(new InvisibleWallRight(), x, y);
    }
    public void down(int x, int y){
        addObject(new InvisibleWallDown(), x, y);
    }
    public void up(int x, int y){
        addObject(new InvisibleWallUp(), x, y);
    }
}
