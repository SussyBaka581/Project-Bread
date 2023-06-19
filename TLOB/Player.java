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
    boolean hasMine = false;
    boolean hasElytra = false;
    boolean hasVCover = false;
    boolean hasScrews = false;
    boolean hasScrewdriver = false;
    boolean doorNotif = false;
    int moveX = 5;
    int moveY = 5;
    public void act()
    {
        //Basic movement
        if(Greenfoot.isKeyDown("W") && !isTouching(InvisibleWallUp.class) && !isTouching(WallUp.class)){
            setLocation(getX(), getY()-moveY);
        }
        if(Greenfoot.isKeyDown("S") && !isTouching(InvisibleWallDown.class) && !isTouching(WallDown.class)){
            setLocation(getX(), getY()+moveY);
        }
        if(Greenfoot.isKeyDown("A") && !isTouching(InvisibleWallLeft.class) && !isTouching(WallLeft.class)){
            setLocation(getX()-moveX, getY());
        }
        if(Greenfoot.isKeyDown("D") && !isTouching(InvisibleWallRight.class) && !isTouching(WallRight.class)){
            setLocation(getX()+moveX, getY());
        }
        //sprinting
        /*if(Greenfoot.isKeyDown("shift")){
            moveX = 10;
            moveY = 10;
        }
        //resets movement
        else{
            moveX = 5;
            moveY = 5;
        }*/
        
        //item booleans
        if(isTouching(Afton.class)){
            hasScrewdriver = true;
        }
        if(isTouching(Tripmine.class)){
            hasMine = true;
        }
        if(isTouching(Butterknife.class)){
            hasButterknife = true;
        }
        if(isTouching(Elytra.class)){
            hasElytra = true;
        }
        if(isTouching(Screws.class)){
            hasScrews = true;
        }
        if(isTouching(VCover.class)){
            hasVCover = true;
        }
        
        if(isTouching(CastleDoor.class) && hasScrewdriver == true && hasMine == true && hasButterknife == true && hasElytra == true && hasScrews == true && hasVCover == true)
        {
            Greenfoot.setWorld(new CastleWorld());
        }
        if(isTouching(DoorBack.class) && doorNotif == false){
            System.out.println("The door locked behind you, no turning back");
            doorNotif = true;
        }
    }
}
