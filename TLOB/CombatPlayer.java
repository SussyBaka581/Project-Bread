import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collection;

/**
 * Write a description of class Sussy_baka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombatPlayer extends Actor
{
    private int wait;
    public static boolean inMenu = true;
    public static boolean inSubMenu = false;
    public static int health = 10;
    /**
     * Act - do whatever the Sussy_baka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if (inMenu == true) {
         if (wait > 0) 
            wait--;
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
      } else if (inMenu == false) {
         if (Greenfoot.isKeyDown("d") && getX() <= 653) {
                setLocation(getX()+5,getY());
         }
         if (Greenfoot.isKeyDown("a") && getX() >= 367) {
                setLocation(getX()-5,getY());
         }
         if (Greenfoot.isKeyDown("w") && getY() >= 410) {
                setLocation(getX(),getY()-5);
         }
         if (Greenfoot.isKeyDown("s") && getY() <= 700) {
                setLocation(getX(),getY()+5);
         }
      } else if (inSubMenu == true) {
          
      }
        //-----------------------------button movement scripts
        
      if (isTouching(FightBtn.class) && (Greenfoot.isKeyDown("enter"))) {
            CombatModule.fightCounter = 0;
            getWorld().setBackground("FightDrop.png");
            inMenu = false;
            CombatModule.isAttacking = true;
            setLocation(500, 550);
            CombatModule.currentBoss.TakeDamage();
            clearScreen();
      }
      /*else if (isTouching(ActBtn.class) && (Greenfoot.isKeyDown("enter"))) {
            getWorld().setBackground("SubMenuDrop.png");
            CombatModule.inActMenu = true;
            clearScreen();
      }
      else if (isTouching(ItemBtn.class) && (Greenfoot.isKeyDown("enter"))) {
            getWorld().setBackground("SubMenuDrop.png");
            CombatModule.inItemMenu = true;
            clearScreen();
      }*/
      else if (isTouching(MercyBtn.class) && (Greenfoot.isKeyDown("enter"))) {
            getWorld().setBackground("SubMenuDrop.png");
            clearScreen();
            CombatModule.inMercyMenu = true;
            setLocation(120, 550);
            //have it end the combat phase and go back to main game
      }
      if (health <= 0) {
          getWorld().removeObject(null);
          Greenfoot.setWorld(new GameOver());
          inMenu = true;
          CombatModule.isAttacking = false;
          health = 10;
      }
    }
    public void clearScreen() {
        Collection objects = getWorld().getObjects(null);
        objects.remove(this);
        getWorld().removeObjects(objects);
    }
    public void movePlr(int x, int y){
        setLocation(x,y);
    }
}

