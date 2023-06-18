import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amogus extends Boss
{
    int counter;
    public Amogus(int h, int a, CombatPlayer plr) {
        super(h,a,"Amogus", " ",plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet;
        if (shouldAttack == "Beam") {
            bullet = new Attack("Beam", Color.RED, 40, 500, 50, playa);
        } else if(shouldAttack == "Bullet") {
            bullet = new Attack("Bullet", Color.RED, 0, 500, 40, playa);
        } else {
            bullet = new Attack("Beam", Color.RED, 40, 500, 50, playa);
        }
        shouldAttack = "";
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
            shouldAttack = "Beam";
        } else if (counter%101 == 0) {
            shouldAttack = "Bullet";
        }
    }
}
