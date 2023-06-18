import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toaster extends Boss
{
    int counter;
    public Toaster(int h, int a, String n, String d, CombatPlayer plr) {
        super(h,a,n,d,plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet = new Attack("Bullet", Color.WHITE, 0, 500, 15, playa);
        shouldAttack = false;
        return bullet;
    }
    
    /**
     * Act - do whatever the Baller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void Update()
    {
        counter++;
        if (counter%100 == 0) {
            shouldAttack = true;
        }
    }
}
