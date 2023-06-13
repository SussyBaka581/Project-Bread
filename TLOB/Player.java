import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sussy_baka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int wait;
    public boolean isAttacking = false;
    /**
     * Act - do whatever the Sussy_baka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if (wait > 0) wait--;
        else
        {
            if (isTouching(FightBtn.class) || (isTouching(ActBtn.class) || (isTouching(ItemBtn.class))))  {
                if (Greenfoot.isKeyDown("d")) {
                    setLocation(getX()+189,getY());
                    wait = 15;
                } 
            }
            if (isTouching(ActBtn.class) || (isTouching(ItemBtn.class) || (isTouching(MercyBtn.class))))  {
                if (Greenfoot.isKeyDown("a")) {
                    setLocation(getX()-189,getY());
                    wait = 15;
                } 
            }
        }
        //-----------------------------button movement scripts
        
        if (isTouching(FightBtn.class) && (Greenfoot.isKeyDown("enter"))) {
            getWorld().setBackground("FightDrop.png");
            getWorld().removeObjects(getWorld().getObjects(null));
            isAttacking = true;
        }
        
        if (isAttacking == true) {
            getWorld().addObject(new Player(), 500, 300);
            System.out.println("runs");
            isAttacking = false;
            //fix this shit
        }
    }
}

