import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleWorld extends ControlWorld
{

    /**
     * Constructor for objects of class CastleWorld.
     * 
     */
    public CastleWorld()
    {
        super(1000, 800, 1);
        addObject(player, 500, 700);
        addObject(new WallUp(), 350, 0);
        addObject(new WallUp(), 800, 0);
        addObject(new WallDown(), 350, 800);
        addObject(new WallDown(), 800, 800);
        addObject(new WallRight(), 1000, 350);
        addObject(new WallRight(), 1000, 800);
        addObject(new WallLeft(), 5, 350);
        addObject(new WallLeft(), 5, 800);
        
        addObject(new DoorBack(), 500, 760);
        addObject(new T(), 500, 400);
    }
}
