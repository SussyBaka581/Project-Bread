import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlWorld extends World
{   static Actor player;
    static Actor butterknife;
    static Actor item1;
    static Actor item2;
    static Actor item3;
    static Actor item4;
    public World world;
    /**
     * Constructor for objects of class MyWorld.
     * 55, 65
     */
    public ControlWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        world = new Frame1();
        player = new Player();
        butterknife = new Butterknife();
        item1 = new Tripmine();
        item2 = new Elytra();
        item3 = new VCover();
        item4 = new Screws();
        Greenfoot.setWorld(world);
        world.addObject(player, 500, 400);
        //world.addObject(butterknife, 792, 187);
        world.addObject(item1, 80, 700);
        //world.addObject(item2, 80, 100);
        //world.addObject(item3, 80, 100);
        //world.addObject(item4, 80, 100);
    }
    
    public void act()
    {
        //BOTTOM LEVEL LEFT/RIGHT
        
        //forward to 2
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15) && (player.getY() >= 710 && player.getY() <= 750))
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 1
        if((player.getX() == 10 || player.getX() == 15) && (player.getY() >= 710 && player.getY() <= 750))
        {
            world = new Frame1();
            Greenfoot.setWorld(world);
<<<<<<< HEAD

=======
>>>>>>> main
            //world.addObject(butterknife, 792, 187);
            world.addObject(item1, 85, 700);
            world.addObject(player, getWidth()-20, player.getY());
        }
        //forward to 3
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15) && (player.getY() >= 510 && player.getY() <= 550)){
            world = new Frame3();
            Greenfoot.setWorld(world);
            world.addObject(item2, 80, 100);
            world.addObject(player, 20, player.getY());
        }
        //backward to 2
        if((player.getX() == 10 || player.getX() == 15) && (player.getY() >= 510 && player.getY() <= 550))
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, getWidth()-20, player.getY());
        }
        
        //BOTTOM LEVEL UP/DOWN
        
        //up to 4
        if(player.getY() == 0 && (player.getX() >= 45 && player.getX() <= 75))
        {
            world = new Frame4();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 1
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15 && (player.getX() >= 45 && player.getX() <= 75))
        {
            world = new Frame1();
            Greenfoot.setWorld(world);
            //world.addObject(butterknife, 792, 187);
            world.addObject(item1, 85, 700);
            world.addObject(player, player.getX(), 20);
        }
        //up to 5
        if(player.getY() == 0 && (player.getX() >= 125 && player.getX() <= 160))
        {
            world = new Frame5();
            Greenfoot.setWorld(world);
            world.addObject(butterknife, 500, 400);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 2
        if ((player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15) && (player.getX() >= 125 && player.getX() <= 160))
        {
            world = new Frame2();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        //up to 6
        if(player.getY() == 0 && (player.getX() >=800 && player.getX() <= 830))
        {
            world = new Frame6();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 3
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15 && (player.getX() >=800 && player.getX() <= 830))
        {
            world = new Frame3();
            Greenfoot.setWorld(world);
            world.addObject(item2, 80, 100);
            world.addObject(player, player.getX(), 20);
        }
        
        //MIDDLE ROW UP/DOWN
        
        //up to 7
        if(player.getY() == 0 && (player.getX() >= 300 && player.getX() <= 330))
        {
            world = new Frame7();
            Greenfoot.setWorld(world);
            world.addObject(item3, 80, 100);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 4
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15 && (player.getX() >= 300 && player.getX() <= 330))
        {
            world = new Frame4();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        //up to 9
        if(player.getY() == 0 && (player.getX() >= 925 && player.getX() <= 955))
        {
            world = new Frame9();
            Greenfoot.setWorld(world);
            world.addObject(item4, 80, 100);
            world.addObject(player, player.getX(), getHeight()-20);
        }
        //back to 6
        if(player.getY() == getHeight()- 10 || player.getY() == getHeight()- 15 && (player.getX() >= 925 && player.getX() <= 955))
        {
            world = new Frame6();
            Greenfoot.setWorld(world);
            world.addObject(player, player.getX(), 20);
        }
        
        //TOP ROW LEFT/RIGHT
        
        //forward to 8
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15) && (player.getY() >= 55 && player.getY() <= 85))
        {
            world = new Frame8();
            Greenfoot.setWorld(world);
            world.addObject(player, 20, player.getY());
        }
        //backward to 7
        if((player.getX() == 10 || player.getX() == 15) && (player.getY() >= 55 && player.getY() <= 85))
        {
            world = new Frame7();
            Greenfoot.setWorld(world);
            world.addObject(item3, 80, 100);
            world.addObject(player, getWidth()-20, player.getY());
        }
        //forward to 9
        if((player.getX() == getWidth()- 10) || (player.getX() == getWidth()- 15) && (player.getY() >= 220 && player.getY() <= 250)){
            world = new Frame9();
            Greenfoot.setWorld(world);
            world.addObject(item4, 80, 100);
            world.addObject(player, 20, player.getY());
        }
        //backward to 8
        if((player.getX() == 10 || player.getX() == 15) && (player.getY() >= 220 && player.getY() <= 250))
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
